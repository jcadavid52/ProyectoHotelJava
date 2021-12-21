package dao;



public class Probar {
    public static void main(String[] args) {
      Conexion objConexioBD = new Conexion();
       if(objConexioBD.getconectar() != null){
           System.out.println("conectado");
       }else{
           System.out.println("Error");
       }

    }
}
