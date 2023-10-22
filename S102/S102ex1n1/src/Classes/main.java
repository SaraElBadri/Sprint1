package Classes;

public class main {
    public static void main(String[] args) throws VendaBuidaException {
        Producte p1 = new Producte("Gafas", 25.99);
        Producte p2 = new Producte("Jeans", 35);
        Producte p3 = new Producte("Blusa", 17.75);


        //calcular total d'una venda
        Venda venda = new Venda();
        venda.afegirProducte(p1);
        venda.afegirProducte(p2);
        venda.afegirProducte(p3);
        System.out.println("El preu total de la venda es: " + venda.calcularTotal());

        //Llençar excepció
        Venda venda2 = new Venda();
        System.out.println(venda2.calcularTotal());

        //get producte amb un index
        venda.getProducte(2);

        //llençar excepció si l'index es inocrrecte
        venda.getProducte(6);

    }
}
