import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("res1", 1));
        restaurants.add(new Restaurant("res2", 2));
        restaurants.add(new Restaurant("res1", 3));
        restaurants.add(new Restaurant("res3", 4));
        restaurants.add(new Restaurant("res4", 5));
        restaurants.add(new Restaurant("res5", 1));

        for(Restaurant restaurant : restaurants){
            System.out.println(restaurant.getNom() + " : " + restaurant.getPuntuacio());
        }
    }
}