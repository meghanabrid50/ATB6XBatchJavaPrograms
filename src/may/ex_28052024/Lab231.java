package may.ex_28052024;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        //Shopping list
        //Milk , butter , bread , cheese
        //4 elements
        //Collection Framework -> How you can store the elements
        //1. List (Interface) -> ArrayList , LinkedList, Vector , stack
        //List can contain duplicates

        List shopping_list = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());

        List fruites = List.of("Orange", "Banana" , "Mango", "Apple", "Watermelon", "Apple");
        System.out.println(fruites);
        System.out.println(fruites.size());

        List my_10th_marks = List.of(91,93,89,98,95);
        System.out.println(my_10th_marks);
        System.out.println(my_10th_marks.size());

        List diff_data_types = List.of("Meghana", true, 123);

        System.out.println(fruites.get(0));
        System.out.println(fruites.indexOf("apple"));
        System.out.println(fruites.isEmpty());


        //add, remove, clear , contains, indexOf, isEmpty, size ,get
        //addAll , removeAll , retainAll, containsAll

       // fruites.add("Grapes");
       // System.out.println(fruites);
    }
}
