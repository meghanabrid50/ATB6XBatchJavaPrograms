package april.ex_20042024;

public class Lab055 {
    public static void main(String[] args) {
        String s1 = "Meghana";
        String s2 = s1;

        System.out.println(s2);

        System.out.println("------");

        String s3 = "TheTestingAcademy";
        s3.toLowerCase();
        System.out.println(s3);  // This is the example of string are immutable.

        String s4 = "Testing";
        s4 = s4.toLowerCase(); //We are assigning value s4 that why the result of lower case is stored in s4
        System.out.println(s4);

    }
}
