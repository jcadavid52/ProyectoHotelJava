package TestCrudHabitacion;
import dao.daoHabitacion;
public class TestEliminarHabitacion {
    public static void main(String[] args) {
        daoHabitacion objHabitacion = new daoHabitacion();
        objHabitacion.eliminarHabitacion(3);
    }
}
