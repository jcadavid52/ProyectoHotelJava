package TestCrudCliente;

import dao.daoCliente;

public class TestEliminarCliente {
    public static void main(String[] args) {
        daoCliente objCliente = new daoCliente();
        objCliente.eliminarCliente(4);
    }
}
