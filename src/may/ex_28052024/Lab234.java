package may.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Meghana");
        myList.add("Megha");
        myList.add("Brid");

        System.out.println("--- Print 1 ---");

        for (String str : myList){
            System.out.println(str);
        }

        System.out.println("--- Print 2 ---");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }

        System.out.println("--- Print 3 ---");
        //Iterator
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
