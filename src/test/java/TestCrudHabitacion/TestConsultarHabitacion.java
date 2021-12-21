package TestCrudHabitacion;
import dao.daoHabitacion;
public class TestConsultarHabitacion {
    public static void main(String[] args) {
      daoHabitacion objHabitacion = new daoHabitacion();
      objHabitacion.consultarHabitacion(1);
    }
}
