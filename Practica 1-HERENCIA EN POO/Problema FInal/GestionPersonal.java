import java.util.List;

public class GestionPersonal {
    public static void generarInforme(List<Empleado> empleados) {
        System.out.println("   INFORME DE EMPLEADOS  ");
        for (Empleado emp : empleados) {
            emp.mostrarInformacion();
        }
    }
}