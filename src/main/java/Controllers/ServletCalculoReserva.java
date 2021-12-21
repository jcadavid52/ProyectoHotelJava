package Controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import Beans.Login;

@WebServlet(name = "ServletCalculoReserva", value = "/ServletCalculoReserva")
public class ServletCalculoReserva extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int dias = Integer.parseInt(request.getParameter(("dias")));
        double tarifa;
        int opcion = Integer.parseInt(request.getParameter("tipo-huesped"));
        double descuento;
        double valorTotal = 0;
        double valorSinIva = 0;


        if(opcion == 2){
            tarifa = 2500;
            valorTotal = dias * tarifa;
            descuento = valorTotal * 0.05;
            valorSinIva = valorTotal - descuento;


        }else if(opcion == 3){
            tarifa = 4600;
            valorTotal = dias * tarifa;
            descuento = valorTotal * 0.09;
            valorSinIva = valorTotal - descuento;

           // out.print("El valor con iva es " + valorTotal);
          //  out.print("El valor con descuento es " + valorSinIva);
        }else if(opcion == 4){
            tarifa = 5200;
            valorTotal = dias * tarifa;
            descuento = valorTotal * 0.15;
            valorSinIva = valorTotal - descuento;

          //  out.print("El valor total es: " + valorTotal);
          //  out.print("El valor con descuento es " + valorSinIva);
        }else{
            //out.print("No seleccionaste ninguna opción");
        }

        request.setAttribute("valorTotal",valorTotal);
        request.setAttribute("valorSiniva",valorSinIva);

        RequestDispatcher despachador = request.getRequestDispatcher("Resultado.jsp");
        despachador.forward(request,response);

    }
 }
