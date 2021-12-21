package TestCrudCliente;

import dao.daoCliente;
public class TestConsultarCliente {
    public static void main(String[] args) {
        daoCliente objCliente = new daoCliente();
        objCliente.consultarCliente(1);
    }
}
