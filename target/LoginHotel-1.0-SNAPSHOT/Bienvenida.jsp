<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 07/10/2021
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenida</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">


    </head>
<body>
<div class="collapse" id="navbarToggleExternalContent" style="position: fixed; width: 100%; z-index: 2;">
    <div class="bg-dark p-4">
        <h5><a href="index.jsp" class="cerrar">Mis reservas</a> </h5>
        <h5><a href="index.jsp" class="cerrar">Cerrar sesión</a> </h5>
        <h5><a href="index.jsp" class="cerrar">Mis reservas</a> </h5>
        <h5><a href="Formulario.jsp" class="cerrar">Calcular mi reserva</a> </h5>
        <h5><a href="CrudGeneralLogin.jsp" class="cerrar">Administrar Usuarios</a> </h5>
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
<br><br><br>
<h1>BIENVENIDO AL SISTEMA ${user}</h1><br><br>

<div class="card mb-3" style="max-width: 615px;">
    <div class="row g-0">
        <div class="col-md-4">
            <img src="images/bedroom.jpg"  alt="...">
        </div>
        <div class="col-md-8">
            <div class="card-body">
                <h5 class="card-title">Habitación de pareja</h5>
                <p class="card-text">Habitación para dos personas, con jacuzzi, silla del amor,televisión, wifi gratis, nevera con licor y mucho más.</p>
                <p class="card-text"><small class="text-muted">Con descuento del 9%</small></p>
            </div>
        </div>
    </div>
</div>

<div class="card mb-3" style="max-width: 630px;">
    <div class="row g-0">
        <div class="col-md-4">
            <img src="images/hoteldos.jpg"  alt="...">
        </div>
        <div class="col-md-8">
            <div class="card-body">
                <h5 class="card-title">Habitación de pareja</h5>
                <p class="card-text">Habitación para dos personas, con jacuzzi, silla del amor,televisión, wifi gratis, nevera con licor y mucho más.</p>
                <p class="card-text"><small class="text-muted">Con descuento del 9%</small></p>
            </div>
        </div>
    </div>
</div>
<br>
<button type="button" class="btn btn-secondary btn-lg">Reservar</button>

<button type="button" class="btn btn-secondary btn-lg">Reservar</button>
<br><br>
<div class="card mb-3" style="max-width: 615px;">
    <div class="row g-0">
        <div class="col-md-4">
            <img src="images/indoors-g1efa3d602_640.jpg"  alt="...">
        </div>
        <div class="col-md-8">
            <div class="card-body">
                <h5 class="card-title">Habitación familiar campestre</h5>
                <p class="card-text">Habitación perfecta para estar en familia, con patio, wifi gratis, televisión, piscina y mucho más.</p>
                <p class="card-text"><small class="text-muted">Con descuento del 15%</small></p>
            </div>
        </div>
    </div>
</div>

<div class="card mb-3" style="max-width: 630px;">
    <div class="row g-0">
        <div class="col-md-4">
            <img src="images/bedroom-g4e251a030_640.jpg"  alt="...">
        </div>
        <div class="col-md-8">
            <div class="card-body">
                <h5 class="card-title">Habitación individual</h5>
                <p class="card-text">Habitación perfecta para trabajar sin que nadie te moleste, con wifi gratis, televisión y mucho más</p>
                <p class="card-text"><small class="text-muted">Con descuento del 5%</small></p>
            </div>
        </div>
    </div>
</div>
<br>
<button type="button" class="btn btn-secondary btn-lg">Reservar</button>
<button type="button" class="btn btn-secondary btn-lg">Reservar</button>

<br><br>


<footer>

    <ul class="nav justify-content-center border-bottom pb-3 mb-3">

        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Características</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Precios</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Preguntas frecuentes</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Acerca de</a></li>
    </ul>
    <p class="text-center text-muted">&copy; 2021 SENA Hotel Company JCC, Inc</p>
</footer>



<style>
    html{
        max-width: 100%;
    }
    body{
        background: bisque;
        padding: 0;
        margin: 0;
    }
    .card{
        background-color: aqua;
        text-align: right;
        left: 5%;
        display: inline-block;
    }

    h1{
        text-align: center;
    }

    .btn{
        display: inline-block;
        margin-left: 4rem;
        margin-right: 28rem;

    }

    footer{
        background-color: #1E1615;
        margin-bottom: 0;
        width: 100%;
        bottom: 0;
        height: 200px;
    }

    .cerrar{
        text-decoration: none;
        color: aliceblue;
    }

    .collapse{
        text-align: center;
    }



</style>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-kQtW33rZJAHjgefvhyyzcGF3C5TFyBQBA13V1RKPf4uH+bwyzQxZ6CmMZHmNBEfJ" crossorigin="anonymous"></script>
</body>
</html>
