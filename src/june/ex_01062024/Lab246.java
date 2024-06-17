package june.ex_01062024;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab246 {
    public static void main(String[] args) {
        Set<String> courselist = new HashSet();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LATB");
        courselist.add("SDET Blueprint");
        System.out.println(courselist);

        for (Object o : courselist){
            System.out.println(o);
        }

        Iterator it = courselist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
