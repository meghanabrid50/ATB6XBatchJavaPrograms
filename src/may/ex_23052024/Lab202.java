package may.ex_23052024;

public class Lab202 {
    public static void main(String[] args) {
        Person p1 = new Person("Meghana");
        Person p2 = new Person("Pramod");
        System.out.println(Person.footBallClub);
        //Static //classname.function
        Person.m1();
        //Non static ref.fun
        p2.m2();
    }
}

class Person{

    {
        System.out.println("IIB");
    }
    //Static function
    static void m1(){
        System.out.println("I am common function");
    }
    //Non static function
    void m2(){
        System.out.println("Person -> "+ this.name);
    }
    String name;//Non static
    static String footBallClub = "Arsenal";

    public Person(String name) {
        this.name = name;
    }
}
