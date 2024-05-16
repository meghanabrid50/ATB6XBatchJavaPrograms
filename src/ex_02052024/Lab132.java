package ex_02052024;

import java.util.Scanner;

public class Lab132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the 1st sub marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the 2nd sub marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the 3rd sub marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the 4th sub marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the 5th sub marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length ; i++) {
            if (marks[i]<30){
                System.out.println("Failed in this subject  ->" + marks[i]);
            }

            System.out.println(marks[i]);

        }

       /* int j=0;
        while (j< marks.length){
            System.out.println(marks[j]);
            J++;
        }
        */

        sc.close();
    }
}
