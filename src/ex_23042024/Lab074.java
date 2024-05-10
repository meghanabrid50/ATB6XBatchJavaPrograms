package ex_23042024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        //Taking a input from user
        //Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
