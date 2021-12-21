package TestCrudCliente;
import dao.daoCliente;
public class TestEditarCliente {
    public static void main(String[] args) {
        daoCliente objCliente = new daoCliente();
        objCliente.editarCliente(4,125456,"carlos",1);
    }
}
