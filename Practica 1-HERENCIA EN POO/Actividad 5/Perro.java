public class Perro extends Canino {
    @Override
    public void comer() {
        System.out.println("El perro esta comiendo croquetas");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro esta ladrando");
    }

    public void vacunar() {
        System.out.println("El perro ha sido vacunado");
    }

    public void sacarPaseo() {
        System.out.println("El perro esta de paseo en el parque");
    }
}