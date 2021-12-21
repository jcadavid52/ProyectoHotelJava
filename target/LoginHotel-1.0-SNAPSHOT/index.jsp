<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="logn.css">
</head>
<body>
<div class="login-box">
    <img src="images/hotel-g03e5785c6_640.jpg" class="avatar" alt="Avatar Image">
    <h1>Inicia Sesión</h1>
    <form action="ServletLogin" method="post">
        <!-- USERNAME INPUT -->
        <label for="username">Usuario</label>
        <input type="text" name="user" placeholder="ingresa usuario">
        <!-- PASSWORD INPUT -->
        <label for="password">Contraseña</label>
        <input type="password" name="password" placeholder="Ingresa clave">
        <input type="submit" name="btn-ingresar">
        <a href="#">¿Ovidaste la contraseña?</a><br>
        <a href="/formulario.html">¿No tienes una cuenta?</a>
    </form>
</div>
<style>
    .login{
        border: black solid;
        position: absolute;
        text-align: center;
        left: 40%;
        padding: 50px;
    }

    h1{
        text-align: center;
    }
</style>
</body>
</html>