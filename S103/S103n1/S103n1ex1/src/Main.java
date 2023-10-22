import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //crear arraylist
        ArrayList<Month> months = new ArrayList<>();

        //afegir els mesos a la llista
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));


        //Print els mesos abans d'afegir agost
        System.out.println("Months abans: ");
        for (Month month : months){
            System.out.println(month.toString());
        }

        //adegir agost a l'index 7
        Month agost = new Month("Agost");
        months.add(7,agost);


        //Print els mesos després d'afegir agost
        System.out.println("Months després:");
        for (Month month : months){
            System.out.println(month.getNom());
        }


        //Convertir la llista en HashSet sense repeticions
        HashSet<Month> monthHashSet = new HashSet<>(months);

        //recorre la llista and un for normal
        System.out.println("Recorre llista amb un for normal:");
        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i).getNom());
        }

        //recorre llista amb iterator
        System.out.println("Recorre llista amb iterator:");
        Iterator<Month> iteratorList = months.iterator();
        while(iteratorList.hasNext()){
            Month moth = iteratorList.next();
            System.out.println(moth.getNom());
        }






    }
}