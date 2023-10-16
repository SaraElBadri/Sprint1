public class Vent extends Instrument {

    public Vent() {
    }

    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de Vent");

    }
}
