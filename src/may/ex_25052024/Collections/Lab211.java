package may.ex_25052024.Collections;

public class Lab211 {
    public static void main(String[] args) {
        int x = 123;
        //String s1 = x;
        //String s2 = (String)x;
        String s1 = String.valueOf(x);
        System.out.println(s1);

        Character ch ='a';  // Wrapper
        char a3 = 'A'; //Primitive
        char a4 = ch;  //Wrapper to primitive - Unboxing - Automatically
        Boolean b =true;
        Long l =34l;
        double d = 90.0;
        float f1 = 90.89f;

        //Wrapper class is used to convert primitive data type into objects.

        Integer intobj = Integer.valueOf(5);
        System.out.println(intobj);

        Integer a2 = 89;
        //AutoBoxing(Primitive -> Wrapper(Automatically)

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(4,5));
        System.out.println(Integer.min(5 ,9));

      //  Integer a11 = new Integer(10);  JDK9 it is removed
        Integer a12 = Integer.valueOf(10);


    }
}
