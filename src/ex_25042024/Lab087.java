package ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        //JDK >13

        int itemcode = 001;

        switch (itemcode){
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a Desktop");
            case 003, 004 -> System.out.println("It is a Mobile");
            default -> System.out.println("Nothing");
        }

        char c = 'a';

        switch (c){
            case 'a','e','i','o','u'-> System.out.println("It a vowel");
            case 'A','E','I','O','U'-> System.out.println("It a vowel");
            default -> System.out.println("It is consonent");
        }
    }
}
