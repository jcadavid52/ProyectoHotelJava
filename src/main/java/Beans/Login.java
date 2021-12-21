package Beans;
import dao.Conexion;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class Login {

    private String user;
    private String Pass;

    public void Login(){}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        this.Pass = pass;
    }

    //public boolean autentication(){return (getPass().equals("123")) ? true:false;}

    Conexion db = new Conexion();
    public boolean autenticacion(){ return (getPass().equals(db.getconectar())) ? true : false; }

    //cuenta las filas de la tabla
    public  int testFilas(){
        int Cont = 0;
        try {
            Conexion objConn = new Conexion();
            objConn.getconectar();
            String sql = "select * from usarios";
            Statement ST = objConn.getconectar().createStatement();
            ResultSet rs = ST.executeQuery(sql);
            ResultSetMetaData rmdata = rs.getMetaData();


            while (rs.next()) {
                Cont++;

            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

        return Cont;
    }

    
}
