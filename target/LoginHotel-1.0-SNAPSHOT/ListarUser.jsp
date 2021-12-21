<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 10/11/2021
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="Beans.Login" import="dao.daoLogin" import="Controllers.ServletCrudLogin"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Title</title>
    <link href="//cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css" rel="stylesheet">
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
</head>
<body>
<form action="ServletCrudLogin" method="get"  >

    <br><br>
    <input class="form-control" type="text" style="position: absolute;left: 30em; top: 6em; width: 15em" name="idUser" placeholder="Ingresa el ID del usuario">

    <button type="submit" name="action" id="consultar" value="Consultar" style="position: absolute; left: 20em; top: 6em" class="btn btn-info btn-block">Consultar Usuario</button> <br><br>

</form>

<h1 style="text-align: center; background-color: darkgrey">Usuarios</h1>


<form action="ServletCrudLogin" method="post"  name="delete">
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
    Login obj = new Login();
    daoLogin objLogin = new daoLogin();
    int cont = 0;
    int filas = obj.testFilas();;

    request.setAttribute("array",objLogin.listarUsuario());

    for (int i = 0; i<filas;i++) {
        request.setAttribute("cont", cont);
%>

    <tr>
        <th scope="row">${array.get(cont)}</th>

        <td>${array.get(cont+1)}</td>

        <td>${array.get(cont+2)}<td>

        <td><button class="btn btn-danger eliminar"   id="eliminar" onclick="eliminar(${array.get(cont)})">Eliminar</button><td>


    </td>

    </tr>

    <%
     cont = cont + 3;
        }
    %>

    </tbody>
</table>
</form>
<script>

function eliminar(id){
    var confirmar;

    confirmar = confirm("Estás seguro de eliminar el usuario");
    if (confirmar){

        Swal.fire(
            'Deleted!',
            'Your file has been deleted.',
            'success'
        )

        alert(id);


    }
}

</script>

</body>
</html>
