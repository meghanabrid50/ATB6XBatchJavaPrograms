package may.ex_30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab239 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("Java for Testers");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add(100);


//        Iterator iterator = ttacourseList.iterator();
//        while (iterator.hasNext()){
//            ttacourseList.add("Meghana");
//            System.out.println(iterator.next());
//        }

//        for (int i = 0; i < ttacourseList.size(); i++) {
//            System.out.println(ttacourseList.get(i));
//
//        }
//
//        for (Object course : ttacourseList){
//            System.out.println(course);
//        }

        //List - ArrayList , LinkedList
//        ListIterator lt = ttacourseList.listIterator();
//        while (lt.hasNext()){
//            System.out.println(lt.next());
//        }

//        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
//        while (lt2.hasPrevious()){
//            System.out.println(lt2.hasPrevious());
//        }

        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while (lt2.hasPrevious()){
            lt2.add("Meghana");
           // System.out.println(lt2.hasPrevious());
        }
    }
}
