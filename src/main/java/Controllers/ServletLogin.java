package Controllers;

import dao.Conexion;
import dao.daoLogin;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
        daoLogin objDaoUser = new daoLogin();
        Conexion objCon = new Conexion();

        //crear variable tipo dispatcher
        RequestDispatcher despachador;

        //validar la autenticacion
        if (objDaoUser.identificar(user, pass) == 1) {
            despachador = request.getRequestDispatcher("Bienvenida.jsp");
            request.setAttribute("user",user);
        } else if (objDaoUser.identificar(user, pass) == 2) {
            despachador = request.getRequestDispatcher("NoLogin.jsp");
        }else{
            despachador = request.getRequestDispatcher("ExcepcionConexion.jsp");

        }



        despachador.forward(request, response);
    }
}
