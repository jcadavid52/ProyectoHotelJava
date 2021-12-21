package TestCRUDUsuarios;

import dao.daoLogin;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import dao.Conexion;
public class TestListarUsuario {

    public static void main(String[] args) {
     daoLogin objDaoUser = new daoLogin();
    for (int i = 0; i<=2;i++) {
        System.out.println(objDaoUser.listarUsuario().get(9));
    }

        //System.out.println("La cantidad de filas es " +testFilas());
    }

}

