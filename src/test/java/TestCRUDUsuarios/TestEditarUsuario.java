package TestCRUDUsuarios;
import dao.daoLogin;
public class TestEditarUsuario {
    public static void main(String[] args) {
        daoLogin objDaoUser = new daoLogin();
        objDaoUser.EditarUsuario("pepe","741",7);
    }
}
