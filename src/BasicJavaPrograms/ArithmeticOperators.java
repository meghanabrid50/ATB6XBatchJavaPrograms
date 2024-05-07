package BasicJavaPrograms;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no");
        int b = sc.nextInt();

        System.out.println("Select which operation you want to do ,+,-,*,%,/");
        char output= sc.next().charAt(0);

        switch(output){
            case '+' : int add= a+b;
                System.out.println("Addition of two numbers is " +add);
                break;

            case '-' : int sub= a-b;
                System.out.println("Subtraction of two numbers is "+ sub);
                break;
            case '*' : int mul= a*b;
                System.out.println("Multiplication of two numbers is "+ mul);
                break;

            case '/' : int div= a/b;
                System.out.println("Division of two numbers is "+ div);
                break;

            case '%' : int mod= a%b;
                System.out.println("mod of two numbers is "+ mod);
                break;

            default:
                System.out.println("It is not a Arithmetic Operator");

                sc.close();


        }
    }
}
