package may.ex_30052024;

import java.util.*;

public class Lab240 {
    public static void main(String[] args) {
        List ttacourseList = new LinkedList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("Java for Testers");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add(100);
        //System.out.println(ttacourseList);

        Vector<String > v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPIT");
        v2.add("SDET Blueprint");
       // System.out.println(v2);

        Enumeration e = v2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
