package BehavioralPatterns.TemplatePattern.ComparableExample;

public class Person implements Comparable<Person> {

    private int age;
    private String name;
    private String phoneNumber;

    public Person(){

    }

    public Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String setName(String name)  {
        return this.name = name;
    }

    public String setPhoneNumber(String phoneNumber)  {
        return this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
