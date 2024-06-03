package ex_07052024;

public class Lab153 {
    public static void main(String[] args) {
        //No return with no parameter
        saySomethingPlease();

        //No return with parameter
        sayHelloToYou("Meghana");

        //return with no parameter
        sumOfTwoNumber(3,4);

        //return with  parameter
        int res= sumOfTwoGood(3,4);
        System.out.println(res);
    }

    static int sumOfTwoGood(int a, int b) {
        return a+b;
    }

    static void sumOfTwoNumber(int a, int b) {
     System.out.println(a+b);
    }

    static void sayHelloToYou(String name) {
       System.out.println("Hello, "+name);
    }

    static void saySomethingPlease() {
    System.out.println("Non Return with No Parameters");
    }
}
