package may.ex_28052024;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add("Meghana");
        myList.add("Megha");
        myList.add("Megha");
        myList.add("Ghana");
        myList.add("ana");
        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove("Megha");
        System.out.println(myList);
        myList.add(123);
        myList.add(true);
        System.out.println(myList);
        System.out.println("_________");

        //How to print?
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // for each
        for (Object obj : myList){
            System.out.println(obj);
        }



    }
}
