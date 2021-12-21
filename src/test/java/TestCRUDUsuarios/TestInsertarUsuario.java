package TestCRUDUsuarios;
import dao.daoLogin;
public class TestInsertarUsuario {
    public static void main(String[] args) {
        daoLogin objDaoUser = new daoLogin();
        objDaoUser.insertarUsuario("el pollo","325");

    }
}
