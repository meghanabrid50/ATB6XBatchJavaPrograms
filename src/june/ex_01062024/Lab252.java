package june.ex_01062024;

import java.util.HashMap;
import java.util.Map;

public class Lab252 {
    public static void main(String[] args) {
        //Map - Key value pair
        //API Testing - JSON - JavaScript Object Notation -Map
        //JSON -Key value pair
        //HashSet and HashMap
        Map<String , Object> map = new HashMap<>();
        map.put("firstname" , "Pramod");
        map.put("age",55);
        map.put("roll" , 1);
        map.put("course" , "ATB");
        map.put("lastname" , "Dutta");
        map.put("isMale", true);
        System.out.println(map);
        System.out.println(map.get("firstname"));
        System.out.println(map.get("age"));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("age"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<String, Object> item: map.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }

    }
}
