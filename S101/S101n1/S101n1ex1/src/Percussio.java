public class Percussio extends Instrument{

    public Percussio() {
    }

    public Percussio(String nom, double preu) {
        super(nom, preu);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");

    }
}
