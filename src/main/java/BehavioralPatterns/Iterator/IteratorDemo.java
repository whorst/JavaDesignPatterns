package BehavioralPatterns.Iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void exampleOne(){
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }
}
