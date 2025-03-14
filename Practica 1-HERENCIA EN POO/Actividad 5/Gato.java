public class Gato extends Felino {
    @Override
    public void comer() {
        System.out.println("El gato se esta comiendo un salmon");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato esta maullando");
    }

    public void vacunar() {
        System.out.println("El gato ha sido vacunado");
    }
}
