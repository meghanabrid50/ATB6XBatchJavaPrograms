package may.ex_04052024;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {
        //Palindrome -> String
        //Naman -> reverese -> Naman
        //1331 -> 1331

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string. I will tell you its Palindrome or not");
        String User_input = sc.next();

        StringBuilder sb = new StringBuilder(User_input);
        String rev_user_input = sb.reverse().toString();
        if (User_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }

    }
}
