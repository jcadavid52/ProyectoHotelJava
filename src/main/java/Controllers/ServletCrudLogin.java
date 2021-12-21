package Controllers;

import dao.daoLogin;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import Beans.Login;

@WebServlet(name = "ServletCrudLogin", value = "/ServletCrudLogin")
public class ServletCrudLogin extends HttpServlet {
    public int variable;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        daoLogin objLogin = new daoLogin();
        String Iduser = request.getParameter("idUser");


              if(Iduser.isEmpty()){
                  RequestDispatcher despachador = request.getRequestDispatcher("CrudGeneralLogin.jsp");
                  despachador.forward(request,response);
              }else{
                  request.setAttribute("array",objLogin.ConsultarUsuario(Integer.parseInt(Iduser)));
                  RequestDispatcher despachador = request.getRequestDispatcher("CrudGeneralLogin2.jsp");
                  despachador.forward(request,response);
              }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String opcion = request.getParameter("action");
        String Id = request.getParameter("ID");
        String User = request.getParameter("User");
        String Pass = request.getParameter("Pass");

        String Error = "Faltan campos por llenar";
        System.out.println(opcion);
        daoLogin objLogin = new daoLogin();

        switch (opcion){
            case "registrar":
              objLogin.insertarUsuario(User,Pass);
              break;
            case "editar":
                objLogin.EditarUsuario(User,Pass,Integer.parseInt(Id));
                break;

            case "EliminarLogin":
                objLogin.eliminarUsuario(Integer.parseInt(Id));
                request.setAttribute("array",objLogin.listarUsuario());
                break;

            default:
                objLogin.eliminarUsuario(Integer.parseInt(opcion));
                request.setAttribute("array",objLogin.listarUsuario());

        }


            RequestDispatcher despachador = request.getRequestDispatcher("CrudGeneralLogin.jsp");
            despachador.forward(request, response);



    }

}
