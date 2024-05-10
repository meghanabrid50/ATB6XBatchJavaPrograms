package ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //MAx no in two
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1 = sc.nextInt();

        System.out.println("Enter a num2");
        int num2 = sc.nextInt();

        //int max = Math.max(num1, num2);
       // System.out.println("Max by math.max function"+max); //This is using predefined function

        if (num1> num1){
            System.out.println("Number1 is Max"+ num1);
        }
        else {
            System.out.println("Number2 is Max"+ num2);
        }
        sc.close();
    }
}
