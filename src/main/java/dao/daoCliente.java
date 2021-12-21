package dao;

import java.sql.ResultSet;
import java.sql.Statement;

public class daoCliente {
    Conexion objCon = new Conexion();
    public void insertarCliente(int cedula,String nombre,int idHabitacion){
        try{
            objCon.getconectar();
            String sql = "insert into clientes value("+null+","+cedula+",'"+nombre+"',"+idHabitacion+")";
            Statement St = objCon.getconectar().createStatement();
            St.executeUpdate(sql);
            System.out.println("cliente registrado");
            objCon.getconectar().close();

        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void editarCliente(int id,int cedula,String nombre,int id_habitacion){
        try{
            objCon.getconectar();
            String sql = "update clientes set cedula = "+cedula+",nombre = '"+nombre+"',id_habitacion = "+id_habitacion+" where id="+id+"";
            Statement St = objCon.getconectar().createStatement();
            St.executeUpdate(sql);
            System.out.println("cliente editado");
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void consultarCliente(int id){
        try{
            objCon.getconectar();
            String sql = "select * from clientes where id = "+id+"";
            Statement St = objCon.getconectar().createStatement();
            ResultSet rs = St.executeQuery(sql);
            while (rs.next()){
                System.out.println("\n ID " + rs.getString(1) + "\n cedula " +rs.getString(2)+"\n nombre "+rs.getString(3)+"\n id_habitación "+rs.getString(4)+"");
            }
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void listarClientes(){
        try{
            objCon.getconectar();
            String sql = "select * from clientes";
            Statement Sta = objCon.getconectar().createStatement();
            ResultSet rs = Sta.executeQuery(sql);
            while (rs.next()){
                System.out.println("\n ID " + rs.getString(1) + "\n cedula " +rs.getString(2)+"\n nombre "+rs.getString(3)+"\n id_habitación "+rs.getString(4)+"");
            }
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public void eliminarCliente(int id){
        try{
            objCon.getconectar();
            String sql = "delete from clientes where id = "+id+"";
            Statement St = objCon.getconectar().createStatement();
            St.executeUpdate(sql);
            System.out.println("cliente eliminado");
            objCon.getconectar().close();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }


}
