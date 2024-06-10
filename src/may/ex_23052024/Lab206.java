package may.ex_23052024;

public class Lab206 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
        Car.Engine engine =c .new Engine("40CC");
        engine.start();
    }
}
class Car{
    String make;

    public Car(String make) {
        this.make = make;
    }

    //Method
    void drive(){
        System.out.println("You can drive car");
    }

    class Engine{
        String hoursepower;

        public Engine(String hoursepower) {
            this.hoursepower = hoursepower;
        }
        void start(){
            System.out.println("Engine is started ->" + make);
        }
    }
}