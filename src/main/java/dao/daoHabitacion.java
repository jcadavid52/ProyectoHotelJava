package dao;
import java.sql.*;

public class daoHabitacion {
    Conexion objCon = new Conexion();
    public void insertarHabitacion(int capacidad,int numero,double precio){
        try{
             objCon.getconectar();
             String sql = "insert into habitaciones value("+null+","+capacidad+","+numero+","+precio+")";
             Statement St = objCon.getconectar().createStatement();
             St.executeUpdate(sql);
             System.out.println("habitación registrada");
             objCon.getconectar().close();

        }catch(Exception e){
         System.out.println("Error " + e.getMessage());
        }
    }

    public void editarHabitacion(int id,int capacidad,int numero,double precio){
        try{
            objCon.getconectar();
            String sql = "update habitaciones set capacidad = "+capacidad+",numero = "+numero+",precio = "+precio+" where id="+id+"";
            Statement St = objCon.getconectar().createStatement();
            St.executeUpdate(sql);
            System.out.println("Habitación editada");
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void consultarHabitacion(int id){
        try{
            objCon.getconectar();
            String sql = "select * from habitaciones where id = "+id+"";
            Statement St = objCon.getconectar().createStatement();
            ResultSet rs = St.executeQuery(sql);
            while (rs.next()){
                System.out.println("\n ID " + rs.getString(1) + "\n capacidad " +rs.getString(2)+"\n numero "+rs.getString(3)+"\n precio "+rs.getString(4)+"");
            }
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void listarHabitacion(){
        try{
            objCon.getconectar();
            String sql = "select * from habitaciones";
            Statement Sta = objCon.getconectar().createStatement();
            ResultSet rs = Sta.executeQuery(sql);
            while (rs.next()){
                System.out.println("\n ID " + rs.getString(1) + "\n capacidad " +rs.getString(2)+"\n numero "+rs.getString(3)+"\n precio "+rs.getString(4)+"");
            }
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void eliminarHabitacion(int id){
        try{
            objCon.getconectar();
            String sql = "delete from habitaciones where id = "+id+"";
            Statement St = objCon.getconectar().createStatement();
            St.executeUpdate(sql);
            System.out.println("habitación eliminada");
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}


