<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 18/11/2021
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ServletCrudLogin" method="get" >

    <br><br>
    <input type="text" style="position: absolute;left: 30em; top: 6em; width: 15em" name="idUser" placeholder="Ingresa el ID del usuario" class="form-control" >
    <button type="submit" name="action" value="Consultar" style="position: absolute; left: 20em; top: 6em" class="btn btn-info btn-block">Consultar Usuario</button> <br><br>

</form>
<h1 style="text-align: center; background-color: darkgrey">Usuarios</h1>
<form action="ServletCrudLogin" method="post" >
<table class="table">
    <thead>
    <tr>

        <th scope="col">#</th>
        <th scope="col">Usuario</th>
        <th scope="col">Contraseña</th>
    </tr>
    </thead>
    <tbody>

    <%

        int cont = 0;
        int filas = 1;



        for (int i = 0; i<filas;i++) {
            request.setAttribute("cont", cont);
    %>

    <tr>
        <th scope="row">${array.get(cont)}</th>

        <td>${array.get(cont+1)}</td>

        <td>${array.get(cont+2)}<td>

        <td><button type="submit" name="action" value="${array.get(cont)}" class="btn btn-danger">Eliminar</button><td>



    </tr>


    <%
            cont = cont + 3;
        }
    %>

    </tbody>
</table>
</form>
</body>
</html>
