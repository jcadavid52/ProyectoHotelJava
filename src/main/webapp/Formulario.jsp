<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 07/10/2021
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
</head>
<body>
<div class="collapse" id="navbarToggleExternalContent" style="position: fixed; width: 100%; z-index: 2;">
    <div class="bg-dark p-4">
        <h5><a href="index.jsp" class="cerrar">Mis reservas</a> </h5>
        <h5><a href="index.jsp" class="cerrar">Cerrar sesión</a> </h5>
        <h5><a href="index.jsp" class="cerrar">Mis reservas</a> </h5>

        <span class="text-muted">HOTEL JCC</span>
    </div>
</div>
<nav class="navbar navbar-dark bg-dark" style="position: fixed; width: 100%; z-index: 2">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"   ></span>
        </button>
    </div>
</nav>
<br><br><br><br><br><br><br><br>



<style>

    html{
        min-height: 100%;

    }

    body{
        margin: 0;

    }
    header{
        text-align: center;
        font-family: "Bookman Old Style";
        background-color: cadetblue;
        height: 75px;

    }

    footer{
        background-color: aqua;
        bottom: 0;
        position: absolute;
        width: 100%;
        height: 40px;
    }
    form{
        border: black solid;
        position: absolute;
        left: 32%;
        padding-left: 50px;
        padding-bottom: 50px;
        padding-right: 305px;

    }

    h2{
        text-align: center;
    }

    #btn-enviar{
        text-align: center;
        position: absolute;
        right: 42%;
    }

    .type-text{
        left: 270px;
        position: absolute;
    }

    footer{
        background-color: #1E1615;
        margin-bottom: 0;
        width: 100%;
        bottom: 0;
        height: 100px;
    }

    .collapse{
        text-align: center;

    }
    .cerrar{
        text-decoration: none;
        color: white;
    }


</style>

<form action="ServletCalculoReserva" class="formulario" method="post">
    <h2>Calcule su reserva</h2>


    Tipo de huesped:
    <select name="tipo-huesped" id="" class="type-text">

        <option value="1">Seleccione</option>
        <option value="2">Individual</option>
        <option value="3">Pareja</option>
        <option value="4">Familiar</option>
    </select><br><br>

    cantidad de días a hospedar:
    <input type="text" name="dias" class="type-text"> <br><br>

    <input type="submit" id="btn-enviar">
</form>

<footer>

    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="Bienvenida.jsp" class="nav-link px-2 text-muted">Home</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Características</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Precios</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Preguntas frecuentes</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Acerca de</a></li>
    </ul>
    <p class="text-center text-muted">&copy; 2021 SENA Hotel Company JCC, Inc</p>
</footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>
</html>
