package may.ex_20052024.abstraction.carEX;

class Car extends Engine {
    @Override
    void start() {
        System.out.println("Starting the car");

    }

    @Override
    void stop() {

    }

    @Override
    void partGearBox(){
        System.out.println("Assemble the gearbox");

    }
}
