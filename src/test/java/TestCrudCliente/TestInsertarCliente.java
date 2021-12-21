package TestCrudCliente;
import dao.daoCliente;
public class TestInsertarCliente {
    public static void main(String[] args) {
       daoCliente objCliente = new daoCliente();
       objCliente.insertarCliente(36369,"sergio",4);
    }
}
