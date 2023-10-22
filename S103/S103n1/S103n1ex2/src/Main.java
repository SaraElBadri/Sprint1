import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //crear primera llista
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        //crear segona llista
        List<Integer> l2 = new ArrayList<>();
        /*Collections.reverse(l1);
        l2.addAll(l1);
        System.out.println("l2: "+ l2);*/
        /*for(int i = l1.size()-1; i>=0; i--){
            l2.add(l1.get(i));
        }*/

        //posicionar a final de la llista
        ListIterator<Integer> listIterator = l1.listIterator(l1.size());

        // agafar primera llista en ordre invers i afegir a segona llista
        while (listIterator.hasPrevious()) {
            int element = listIterator.previous();
            l2.add(element);
        }

        System.out.println("Llista original: ");
        for (int number : l1){
            System.out.println(number);
        }

        System.out.println("Segona llista: ");
        for (int number : l2){
            System.out.println(number);
        }
    }
}