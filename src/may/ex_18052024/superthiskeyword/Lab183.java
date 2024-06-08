package may.ex_18052024.superthiskeyword;

public class Lab183 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        //If child has DC -> PC DC will be called by super() automatically in java
        //super.variable
        //super.method()
        //Super() -> DC
        //super('Meghana')-> PC
    }
}

class Person1{
    Person1(){
        System.out.println("Person1 -DC");
    }
}
class Student1 extends Person1{
    Student1(){
        super();
        System.out.println("Studnet -DC");
    }

}