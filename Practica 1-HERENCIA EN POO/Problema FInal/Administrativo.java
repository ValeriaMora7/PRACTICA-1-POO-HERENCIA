public class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, int id, int salarioBase, int horasExtra) {
        super(nombre, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public int calcularSalario() {
        return salarioBase + (horasExtra * 20000); // Cada hora extra suma 20000
    }
}