package BasicJavaPrograms;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println(num +" is a positive number.");
        }
        else{
            System.out.println(num +" is a negative number.");
        }
        sc.close();
    }
}
