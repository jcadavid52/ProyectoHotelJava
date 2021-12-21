<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 04/11/2021
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>

<div class="container">
    <a href="#ventana1" class="btn btn-warning btn-block"  data-toggle="modal"> <i class="fas fa-plus"></i>Editar</a>


</div>
<form action="ServletCrudLogin" method="post" id="EditarUsuario" class="was-validated">
<div class="modal fade" id="ventana1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header bg-info text-white" >
                <button tyle="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h2 class="modal-title">Editar Usuario</h2>
            </div>
            <div class="modal-body">
                <label for="">Id: </label>
                <input type="text" class="form-control" name="ID" required><br><br>

                <label for="">usuario: </label>
                <input type="text" class="form-control" name="User" required><br><br>

                <label for="">Clave: </label>
                <input type="text" name="Pass" class="form-control" required><br><br>
            </div>

            <div class="modal-footer">
                <button value="editar" name="action" type="submit" class="btn btn-success">Editar</button><br><br>
                <label for="" style="color: #b80f22">${Error}</label>
            </div>
        </div>
    </div>

</div>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
