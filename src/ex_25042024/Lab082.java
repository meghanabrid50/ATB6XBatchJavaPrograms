package ex_25042024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Enter Char is vowel " + ch);
        } else {
            System.out.println("Enter Char is Consonent " + ch);
        }

        sc.close();

    }
}
