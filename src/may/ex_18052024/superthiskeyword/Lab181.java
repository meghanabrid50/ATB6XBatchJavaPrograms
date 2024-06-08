package may.ex_18052024.superthiskeyword;

public class Lab181 {
    public static void main(String[] args) {
        //Super Keyword in java
        //Parent -> Child
        // Super keyword reference to parent class
        //variable of parent
        //Method of Parent
        //Constructor of the parent

        Car c = new Car();
        int speed = c.maxSpeed;
        System.out.println(speed);
        c.display();


    }
}
class Car extends Vehicle{
    int maxSpeed = 180;
    void display(){
        System.out.println("Max speed of the Vehicle can be "+ super.maxSpeed);
        System.out.println("Max speed of the car can be "+ this.maxSpeed);
    }
}

class Vehicle{
    int maxSpeed = 100;  //Instance variable

    void msg()
    {
        System.out.println("This is Vehicle class");
    }

}
