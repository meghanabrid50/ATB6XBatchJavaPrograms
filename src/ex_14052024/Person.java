package ex_14052024;

public class Person {

    String name;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;


        }

    Person(Person person){  // Copy constructor
        this.name = person.name;
        this.age = person.age;

    }

    public static void main(String[] args) {
        Person per1 = new Person(34, "John");
        Person per2 = new Person(per1);
        System.out.println(per1.name + " is " + per1.age + " Years old ");

    }
}
