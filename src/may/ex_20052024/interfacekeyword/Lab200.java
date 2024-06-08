package may.ex_20052024.interfacekeyword;

public class Lab200 {

}
class Meghana extends B1{

    @Override
    public void atb() {
        System.out.println("ATB Completed");
    }

    @Override
    void mtb() {

    }
}
abstract class B1 implements Course{
abstract void mtb();

}
interface Course{
    void atb();
}

