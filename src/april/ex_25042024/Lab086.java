package april.ex_25042024;

public class Lab086 {
    public static void main(String[] args) {
        //JDK >13

        int itemcode = 004;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is an Electronic Gadget");
                break;
            case 004,005,006:
                System.out.println("It is an Mechanical Gadget");
                break;
            default:
                System.out.println("None");

        }
    }
}
