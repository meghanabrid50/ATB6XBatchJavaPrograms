package may.ex_20052024.interfacekeyword;

public class Car1 implements Brake,Engine{
    @Override
    public void applybrake() {
        System.out.println("Applying Brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");

    }
}
