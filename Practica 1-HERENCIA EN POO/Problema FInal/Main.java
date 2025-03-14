import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Crear empleados de diferentes tipos
        empleados.add(new Gerente("Valeria Mora", 1110040435, 5000000, 100000));
        empleados.add(new Desarrollador("Jaider Ledesma", 1130673042, 3500000, 3));
        empleados.add(new Administrativo("Angie Gonzales", 16535437, 3000000, 10));

        // Generar el informe con el cálculo de salarios
        GestionPersonal.generarInforme(empleados);
    }
}
