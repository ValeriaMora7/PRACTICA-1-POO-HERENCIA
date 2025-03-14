public class Vehiculo {
private String Marca; 
private String Modelo; 
// Métodos getter y setter para acceder a los atributos privados
    public String getMarca() {
        return Marca;
    }
    
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getModelo() {
        return Modelo;
    }
    
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void encender() {
     System.out.println("El vehículo esta encendido."); } 
     
 
    public void apagar() {
        System.out.println("El vehiculo ahora esta apagado.");
    }
    

    public void acelerar(int velocidad) {
        System.out.println("El vehiculo esta acelerando a " + velocidad + " km/h.");
    }

   // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
    }
 
    }
