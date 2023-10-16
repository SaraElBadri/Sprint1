package Classes;

public class Telefon {
    private String  marca;
    private String model;

    public Telefon() {
    }

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }


    public void trucar(String numero){
        System.out.println( "S'està trucant al número: " + numero);
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
