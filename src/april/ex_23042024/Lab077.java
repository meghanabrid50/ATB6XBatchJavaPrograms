package april.ex_23042024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        //Grade Calculator
//Write a pgm that calculates and displays the letter of grade for a given
        //Numerical score (e.g 'A', 'B', 'C', 'D' or 'F') on the following
        //Grading Scale
        //A = 90-100
        //B = 80-89
        //C = 70-79
        //D = 60-69
        //F = 00-59

        //Rule 1== Find the user inputs
        //Score == data type ==int
        //return --> Grade= data type = char or string

        //Rule2 --> Basic Logic
        //if(score >=90 && score <= 100) --> return grade A
        //else if(score >=89 && score <=80) --> return grade B
        //else --> Grade --> F

        //Rule 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score!!");
        int score = sc.nextInt();

        if (score >=90 && score<=100){
            System.out.println("You grrade is -->Grade A");
        }
        else if (score >=80 && score<=89){
            System.out.println("You grrade is -->Grade B");
        }
        else if (score >=70 && score<=79){
            System.out.println("You grrade is -->Grade C");
        }
        else if (score >=60 && score<=69){
            System.out.println("You grrade is -->Grade D");
        }
        else {
            System.out.println("You grrade is -->Grade F");
        }
        sc.close();

        //System.out.println("Your Grade is -->"+);






    }
}
