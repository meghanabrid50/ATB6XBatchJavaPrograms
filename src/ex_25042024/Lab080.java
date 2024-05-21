package ex_25042024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        //If-else -Condition(if, else-if,else)- multiple condition
        //switch - multiple condition

        //Create a program for a week
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number. Then I will tell you which day it is!!");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Only number 1-7 are allowed");


        }
        System.out.println("End of the Program. I will executed anyhow!!");
        sc.close();
    }
}
