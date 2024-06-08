package april.ex_23042024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a num1");
        int num1 = sc.nextInt();
        if(num1 > 20)
        {
            System.out.println("Num > 20");
        }
        else if (num1 > 10){
            System.out.println("Num is between 10 and 20");
        }
        else {
            System.out.println("Num < 20");
        }
        sc.close();
    }
}
