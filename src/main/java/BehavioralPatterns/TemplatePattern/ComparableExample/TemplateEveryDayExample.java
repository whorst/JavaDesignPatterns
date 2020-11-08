package BehavioralPatterns.TemplatePattern.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEveryDayExample {

    private static void printContents(List<Person> people) {
        for(Person person: people){
            System.out.println(person.getName());
        }

    }
    public static void main(String args[]){
        Person Perin = new Person("Perin", "186753091", 4);
        Person Derin = new Person("Derin", "786753092", 52);
        Person Lerin = new Person("Lerin", "686753093", 43);

        List<Person> people = new ArrayList<Person>();
        people.add(Perin);
        people.add(Derin);
        people.add(Lerin);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("Sorted by age");
        printContents(people);

    }
}
