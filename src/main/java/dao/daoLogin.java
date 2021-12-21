package dao;

import Beans.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class daoLogin implements Login_I {
 Conexion objConn = new Conexion();
 int Cont;

 public int identificar(String user, String clave) {

  try {
   objConn.getconectar();
   String sql = "SELECT * FROM usarios WHERE user = '" + user + "' and  pass = '" + clave + "'";
   Statement ST = objConn.getconectar().createStatement();
   ResultSet rs = ST.executeQuery(sql);
   while (rs.next()) {
   System.out.println("\nID  " + rs.getInt(1) + "\nUsuario " + rs.getString(2) + "\nClave " + rs.getString(3));

    Cont++;
   }
   if (Cont == 1) {
    Cont = 1;
   } else {
    Cont = 2;
   }
   objConn.getconectar().close();


  } catch (Exception e) {
   System.out.println("Error " + e.getMessage());
  }

  return Cont;
 }

 public List<String> listarUsuario() {
  List<String>usuarios = new ArrayList<>();
  try {

   objConn.getconectar();
   String sql = "select * from usarios";
   Statement ST = objConn.getconectar().createStatement();
   ResultSet rs = ST.executeQuery(sql);
   ResultSetMetaData rmdata = rs.getMetaData();
   int cantidadColumnas = rmdata.getColumnCount();

   while (rs.next()) {
   // System.out.println("\nID  " + rs.getInt(1) + "\nUsuario " + rs.getString(2) + "\nClave " + rs.getString(3));


    usuarios.add(rs.getString(1));
    usuarios.add(rs.getString(2));
    usuarios.add(rs.getString(3));
   }


   objConn.getconectar().close();
  } catch (Exception e) {
   System.out.println("Error " + e.getMessage());
  }

 return usuarios;
 }

 public void insertarUsuario(String user, String pass) {
  try {
   objConn.getconectar();
   String sql = "insert into usarios value(" + null + ",'" + user + "','" + pass + "')";
   Statement ST = objConn.getconectar().createStatement();
   ST.executeUpdate(sql);
   System.out.println("Se insertó con éxito");
   objConn.getconectar().close();
  } catch (Exception e) {
   System.out.println("Error " + e.getMessage());
  }
 }

 public void EditarUsuario(String user, String pass, int id) {
  try {
   objConn.getconectar();
   String sql = "update usarios set user = '" + user + "',pass = '" + pass + "' where id = " + id + "";
   Statement ST = objConn.getconectar().createStatement();
   ST.executeUpdate(sql);
   System.out.println("Se editó con éxito");
   objConn.getconectar().close();
  } catch (Exception e) {
   System.out.println("Error " + e.getMessage());
  }
 }

 public void eliminarUsuario(int id){
  try{
   objConn.getconectar();
   String sql = "delete from usarios where id="+id+" ";
   Statement ST = objConn.getconectar().createStatement();
   ST.executeUpdate(sql);
   System.out.println("Se eliminó con éxito");
   objConn.getconectar().close();
  }catch(Exception e){
   System.out.println("Error " + e.getMessage());
  }
 }

 public List<String> ConsultarUsuario(int id) {
  List<String>Cusuarios = new ArrayList<>();
  try {

   objConn.getconectar();
   String sql = "select * from usarios WHERE id = '" + id + "'";
   Statement ST = objConn.getconectar().createStatement();
   ResultSet rs = ST.executeQuery(sql);

   while (rs.next()) {
    // System.out.println("\nID  " + rs.getInt(1) + "\nUsuario " + rs.getString(2) + "\nClave " + rs.getString(3));


    Cusuarios.add(rs.getString(1));
    Cusuarios.add(rs.getString(2));
    Cusuarios.add(rs.getString(3));
   }


   objConn.getconectar().close();
  } catch (Exception e) {
   System.out.println("Error " + e.getMessage());
  }

  return Cusuarios;
 }
}
