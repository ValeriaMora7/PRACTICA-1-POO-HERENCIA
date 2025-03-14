// Subclase Gerente
public class Gerente extends Empleado {
    private int bonoAnual;

    public Gerente(String nombre, int id, int salarioBase, int bonoAnual) {
        super(nombre, id, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public int calcularSalario() {
        return salarioBase + bonoAnual;
    }
}

