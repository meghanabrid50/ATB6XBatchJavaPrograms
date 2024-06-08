package may.ex_18052024.superthiskeyword;

public class Lab182 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.message();
        s1.display();
    }

}
class Student extends Person{
    //Is A relation
    void message(){
        System.out.println("I am Student Message");
    }
    void display(){
        //this.message();
        super.message();
    }
}
class Person{
    void message(){
        System.out.println("I am person message");
    }
}
