package ex_18042024;

public class Lab049 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
        // Part A -> ++a , Ex1=11  , a=11
        // Part B -> a++ , Ex2=11  , a=12
        // Part C -> a++ , Ex3=12 , a=13

        //op --> ex1+ex2+ex3

        System.out.println(a);
    }
}
