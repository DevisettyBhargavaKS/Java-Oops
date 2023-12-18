package org.example.JavaOOps.Collections;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("java", 10);
        map.put("collections", 20);
        map.put("hashmap", 30);
        System.out.println("Size of map is:- "
                + map.size());
        System.out.println(map);
        if (map.containsKey("hashmap")) {
            Integer a = map.get("hashmap");
            System.out.println("value for key"
                    + " \"hashmap\" is:- " + a);
        }
    }
}
