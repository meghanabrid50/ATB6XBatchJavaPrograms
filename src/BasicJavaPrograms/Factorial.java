package BasicJavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println("Enter a number");

        long fact=1;

        for (int i = 1; i <=num ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
        sc.close();
    }
}
