public class Auto extends Vehiculo { 
    private String TipoDeCombustible;

    public String getTipoDeCombustible() {
        return TipoDeCombustible;
    }
    
    public void setTipoDeCombustible(String TipoDeCombustible) {
        this.TipoDeCombustible = TipoDeCombustible;
    }

    @Override
    public void encender() {
        System.out.println("El auto esta encendido y listo para conducir.");
    }
        @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Tipo de Combustible: " + TipoDeCombustible);
    }
    
}  