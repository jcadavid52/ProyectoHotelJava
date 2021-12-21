<%--
  Created by IntelliJ IDEA.
  User: jcadavic
  Date: 06/10/2021
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="Bienvenida.jsp">Volver al inicio</a><br>
<h3>El valor total es: ${valorTotal}</h3>
<h3>El valor con descuento es: ${valorSiniva}</h3>
<%

    /*
    int dias = Integer.parseInt(request.getParameter(("dias")));
    double tarifa;
    int opcion = Integer.parseInt(request.getParameter("tipo-huesped"));
    double descuento;
    double valorTotal;
    double valorSinIva;


    if(opcion == 2){
        tarifa = 2500;
       valorTotal = dias * tarifa;
       descuento = valorTotal * 0.05;
       valorSinIva = valorTotal - descuento;

       out.print("El valor total es: " + valorTotal);
       out.print("El valor con descuento es " + valorSinIva);
    }else if(opcion == 3){
        tarifa = 4600;
        valorTotal = dias * tarifa;
        descuento = valorTotal * 0.09;
        valorSinIva = valorTotal - descuento;

        out.print("El valor con iva es " + valorTotal);
        out.print("El valor con descuento es " + valorSinIva);
    }else if(opcion == 4){
        tarifa = 5200;
        valorTotal = dias * tarifa;
        descuento = valorTotal * 0.15;
        valorSinIva = valorTotal - descuento;

        out.print("El valor total es: " + valorTotal);
        out.print("El valor con descuento es " + valorSinIva);
    }else{
        out.print("No seleccionaste ninguna opción");
    }
*/
%>
</body>
</html>
