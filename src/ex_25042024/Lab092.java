package ex_25042024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //Program to check Grade based on marks

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        //90 -> 90/10 ->9 -> A (90-100)->A
        //87 -> 87/10 ->8 -> B (80-89)->B
        //77 -> 77/10 ->7 -> C (70-79)->C

        marks = marks/10;
        System.out.println(marks);

        switch (marks){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 1:
                System.out.println("Fail");
                break;
            default:
                System.out.println("None");


        }

        sc.close();
    }
}
