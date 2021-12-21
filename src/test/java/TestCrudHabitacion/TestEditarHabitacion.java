package TestCrudHabitacion;
import dao.daoHabitacion;
public class TestEditarHabitacion {
    public static void main(String[] args) {
        daoHabitacion objHabitacion = new daoHabitacion();
        objHabitacion.editarHabitacion(1,4,74,160000);
    }
}
