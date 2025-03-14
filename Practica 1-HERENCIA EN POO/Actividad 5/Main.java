public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Tigre tigre = new Tigre();
        Gato gato = new Gato();
        Lobo lobo = new Lobo();
        Perro perro = new Perro();

        System.out.println("Animales:");

        System.out.println("Felinos:");
        leon.comer();
        leon.hacerRuido();

        tigre.comer();
        tigre.hacerRuido();

        gato.comer();
        gato.hacerRuido();
        gato.vacunar();

        System.out.println("Caninos:");
        lobo.comer();
        lobo.hacerRuido();

        perro.comer();
        perro.hacerRuido();
        perro.vacunar();
        perro.sacarPaseo();
    }
}