package TestCRUDUsuarios;
import dao.daoLogin;
public class TestEliminarUsuario {
    public static void main(String[] args) {
        daoLogin objDaoUser = new daoLogin();
        objDaoUser.eliminarUsuario(7);
    }


}
