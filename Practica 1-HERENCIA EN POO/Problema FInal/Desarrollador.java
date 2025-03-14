public class Desarrollador extends Empleado {
    private int proyectosAsignados;

    public Desarrollador(String nombre, int id, int salarioBase, int proyectosAsignados) {
        super(nombre, id, salarioBase);
        this.proyectosAsignados = proyectosAsignados;
    }

    @Override
    public int calcularSalario() {
        return salarioBase + (proyectosAsignados * 50000); // Cada proyecto añade 50000 al salario
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Desarrollador: " + nombre + " | ID: " + id + " | Proyectos: " + proyectosAsignados + 
      " | Salario: $" + calcularSalario() + " COP");
    }
}