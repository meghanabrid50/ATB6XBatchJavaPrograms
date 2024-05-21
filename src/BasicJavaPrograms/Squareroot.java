package BasicJavaPrograms;


import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of X");
        double x= sc.nextDouble();
        System.out.println("Enter value of Y");
        double y= sc.nextDouble();
        System.out.println("Enter value of Z");
        double z= sc.nextDouble();

        double result;
        result =Math.cbrt((Math.pow(x,2))+(Math.pow(y,2))-(Math.abs(z)));
        System.out.println(result);

sc.close();
    }
}
