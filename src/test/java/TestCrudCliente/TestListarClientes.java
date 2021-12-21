package TestCrudCliente;
import dao.daoCliente;
public class TestListarClientes {
    public static void main(String[] args) {
        daoCliente objCliente = new daoCliente();
        objCliente.listarClientes();
    }
}
