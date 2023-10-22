package Classes;

import java.util.ArrayList;
import java.util.List;



public class Venda {


    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.preuTotal= 0;
        this.productes = new ArrayList<>();
    }

    public double calcularTotal()  {
        try {
            if (productes.isEmpty()) {
                throw new VendaBuidaException();
            }
        }catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }
       return preuTotal;
    }

    public void afegirProducte(Producte producte){
        productes.add(producte);
        preuTotal += producte.getPreu();
    }

    public void getProducte(int i){
        try {

            Producte producte = productes.get(i);
            System.out.println("Producte: " + i +  "\n" +
                    "Nom: " + producte.getNom() + "\n" +
                    "Preu: " + producte.getPreu());
        }catch(IndexOutOfBoundsException e){
            System.out.println("No existeix un producte amb aquest index: " + e.getMessage());
        }
    }
}
