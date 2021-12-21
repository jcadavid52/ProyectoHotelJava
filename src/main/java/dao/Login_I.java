package dao;
import dao.daoLogin;
import java.util.List;
public interface Login_I {

    public List<String> listarUsuario();

    public void insertarUsuario(String user,String pass);

    public void EditarUsuario(String user,String pass,int id);

    public void eliminarUsuario(int id);

    public List<String> ConsultarUsuario(int id);
}
