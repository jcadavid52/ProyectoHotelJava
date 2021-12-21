package dao;
import java.sql.*;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/hoteldb";
    public static final String USER = "root";
    public static final String CLAVE = "";



    public Connection getconectar(){
        Connection con = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

}
