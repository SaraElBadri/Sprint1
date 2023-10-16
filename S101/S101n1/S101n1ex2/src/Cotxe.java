public class Cotxe {
    static final String marca = "Hyundai";
    static String model;

    final int potencia = 90;

    public Cotxe(String model) {
        this.model = model;

    }

    static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");

    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPotencia() {
        return potencia;
    }
}
