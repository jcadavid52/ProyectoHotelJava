package TestCRUDUsuarios;

import dao.daoLogin;
public class TestIndentificarUsuario {
    public static void main(String[] args) {
        daoLogin objDaoUser = new daoLogin();
        objDaoUser.identificar("jcadavid","123");
    }
}
