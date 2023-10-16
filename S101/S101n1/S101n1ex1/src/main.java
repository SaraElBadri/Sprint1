public class main {
    public static void main(String[] args) {

        Corda guitarra  = new Corda("Guitarra", 78.99);
        Vent flauta = new Vent("Flauta", 40.22);
        Percussio tambor = new Percussio("tambor", 58.20);

        guitarra.tocar();
        flauta.tocar();
        tambor.tocar();

    }
}
