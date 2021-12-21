package TestCrudHabitacion;
import dao.daoHabitacion;

public class TestInsertarHabitacion {
    public static void main(String[] args) {
        daoHabitacion objhabitacion = new daoHabitacion();
        objhabitacion.insertarHabitacion(6,85,320000);
    }
}
