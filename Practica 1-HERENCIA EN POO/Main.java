// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Auto
        Auto Auto1 = new Auto();
        //Tipo de dato, nombre variable
        Auto1.setMarca("Toyota"); 
        Auto1.setModelo ("Yaris"); 
        Auto1.setTipoDeCombustible ("Gasolina"); 

        iniciarVehiculo(Auto1);
        Auto1.mostrarInformacion(); 
        Auto1.acelerar(80);
        Auto1.apagar();
        
        System.out.println(); 
        
        // Creación de un objeto de la clase Motocicleta
        Motocicleta Moto1 = new Motocicleta();
        Moto1.setMarca("Honda"); 
        Moto1.setModelo("PCX160"); 
        Moto1.setTipoDeCombustible ("Gasolina");

        iniciarVehiculo(Moto1);
        Moto1.mostrarInformacion(); 
        Moto1.acelerar(100);
        Moto1.apagar();

         System.out.println();


         // Creación de un objeto de la clase Camioneta
        Camioneta Camioneta1 = new Camioneta();
        Camioneta1.setMarca("Ford");
        Camioneta1.setModelo("F-150");
        Camioneta1.setcapacidadPasajeros(5);


        iniciarVehiculo(Camioneta1);
        Camioneta1.mostrarInformacion();
        Camioneta1.acelerar(60);
        Camioneta1.apagar();

        
        
        System.out.println();
    }
        // Método polimórfico en la clase Main que recibe cualquier Vehiculo y llama encender()
    public static void iniciarVehiculo(Vehiculo vehiculo) {
        vehiculo.encender();

    }
}
