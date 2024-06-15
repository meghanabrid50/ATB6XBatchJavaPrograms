package may.ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {

    public static void main(String[] args) {
        List<String> courselist = new ArrayList();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LATB");
        courselist.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courselist.addAll(numList);
        System.out.println(courselist);

    }
}
