package may.ex_07052024;

import java.util.Scanner;

public class Lab154 {
    public static void main(String[] args) {
        //Divide the task into the smaller chunks
        //Calculator
        //sum task -> sum fun
        //sub task -> Sub fun


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        //calc
        int res_sum= sum(num1,num2);
        System.out.println("Sum is->"+ res_sum);

        int res_sub= sub(num1,num2);
        System.out.println("Sub is->"+ res_sub);

        int res_mul= mul(num1,num2);
        System.out.println("mul is->"+ res_mul);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
}
