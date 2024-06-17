package june.ex_01062024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab254 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("firstname", "Meghana");
        map.put("lastname", "Brid");
        map.put("email", "dkvnd@dkn.cdd");
        map.put("phone", "437457467");
        map.put("city" , "Mumbai");
        //System.out.println(map);

        Map<String , String> map2 = new HashMap<>();
        map2.put("firstname", "Megha");
        map2.put("lastname", "rcin");
        map2.put("email", "dkvnd@dkn.cdd");
        map2.put("phone", "437457467");
        map2.put("city" , "Mumbai");
        //System.out.println(map2);

        ArrayList list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
