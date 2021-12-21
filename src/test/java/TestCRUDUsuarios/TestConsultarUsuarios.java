package TestCRUDUsuarios;

import dao.daoLogin;

public class TestConsultarUsuarios {
    public static void main(String[] args) {
        daoLogin objLogin = new daoLogin();
        System.out.println(objLogin.ConsultarUsuario(1).get(0));
        System.out.println(objLogin.ConsultarUsuario(1).get(1));
        System.out.println(objLogin.ConsultarUsuario(1).get(2));

    }
}
