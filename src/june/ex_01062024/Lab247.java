package june.ex_01062024;


import java.util.LinkedHashSet;
import java.util.Set;

public class Lab247 {
    public static void main(String[] args) {
        Set<String> courselist = new LinkedHashSet();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LATB");
        courselist.add("SDET Blueprint");
        System.out.println(courselist);
    }
}
