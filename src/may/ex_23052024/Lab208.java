package may.ex_23052024;

public class Lab208 {
    public static void main(String[] args) {
        ABC abc = new ABC() {
            @Override
            void m1() {
                System.out.println("m1");
            }
        };
    }
}

abstract class ABC{
    abstract void m1();

}
