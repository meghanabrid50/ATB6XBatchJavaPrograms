package ex_20042024;

import java.util.Locale;

public class Lab064 {
    public static void main(String[] args) {
        String Pass = "Meghana@123";
        String pass_u = Pass.toLowerCase();

        System.out.println(pass_u == Pass);
        System.out.println(pass_u.equals(Pass));
        System.out.println(pass_u.equalsIgnoreCase(Pass));

        System.out.println(Pass.substring(0,3));
        System.out.println(Pass.indexOf("M"));

    }
}
