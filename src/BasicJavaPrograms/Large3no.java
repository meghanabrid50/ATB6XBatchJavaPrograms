package BasicJavaPrograms;

import java.util.Scanner;

public class Large3no {
    public static void main(String[] args) {
        System.out.println("Enter 1st no:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd no:");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd no:");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3)
        {
            System.out.println(num1 +" is the largest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 +" is the largest number");
        }
        else {
            System.out.println(num3 +" is the largest number");
        }
        sc.close();


    }
}
