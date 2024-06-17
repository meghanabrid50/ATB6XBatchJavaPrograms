package june.ex_01062024;

public class Lab256 {
    public static void main(String[] args) {
        //Generics
        printF(3,4);
        printF("Meghana" , "Brid");
        printF(true , true);
        printF(3.14 , 4.44);

    }

    private static <T> void printF( T i, T i1) {
        System.out.println(i);
        System.out.println(i1);
    }
}
