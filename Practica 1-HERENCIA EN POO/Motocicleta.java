public class Motocicleta extends Vehiculo { 
    private String TipoDeCombustible;

    public String getTipoDeCombustible(){
        return TipoDeCombustible;
    }
    public void setTipoDeCombustible(String TipoDeCombustible){
    this.TipoDeCombustible= TipoDeCombustible;
    }

     @Override 
     public void encender() {
System.out.println("La motocicleta esta encendida. Ponte el casco."); } 

@Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Combustible: " + TipoDeCombustible);
    }

}