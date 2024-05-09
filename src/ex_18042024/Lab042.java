package ex_18042024;

public class Lab042 {
    public static void main(String[] args) {
        int a1= 300;
     //   byte b1 =a1;
        byte b1 = (byte) a1;   // Explicit Casting
        System.out.println(b1);



        //300 --> 32 bits   00000000000000000000000100101100
        //byte --> 8 bits
        //00101100
        //44

    }
}
