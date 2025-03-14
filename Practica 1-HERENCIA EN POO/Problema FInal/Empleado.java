public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected int  salarioBase;
    //Metodo Constructor
     public Empleado(String nombre, int id, int salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract int calcularSalario(); // Método abstracto

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | ID: " + id + " | Salario: $" + calcularSalario() + " COP");
    }
}
