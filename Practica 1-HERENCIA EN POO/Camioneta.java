class Camioneta extends Vehiculo {
    private int capacidadPasajeros;

    public int getcapacidadPasajeros(){
        return capacidadPasajeros;
    }
    public void setcapacidadPasajeros(int capacidadPasajeros){
        this.capacidadPasajeros=capacidadPasajeros;
    }
    @Override
    public void encender() {
        System.out.println("La camioneta esta encendida y lista para viajar con comodidad");
    }
    @Override
    public void mostrarInformacion(){
   super.mostrarInformacion();
    System.out.println("Su capacidad es de: " + capacidadPasajeros+ " pasajeros");
    }
}