package Summer_DSA.HashMap;
import java.util.*;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating HashMap");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //putIfAbsent method
        map.putIfAbsent(5,"Orange");
        System.out.println("Iterating HashMap");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.putIfAbsent(5,"PineApple");
        System.out.println("Iterating HashMap");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //putAll method
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.putAll(map);
        map2.put(6,"Guava");

        System.out.println("Iterating HashMap2");
        for(Map.Entry m : map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //key or value based removal
        map.remove(1);
        System.out.println("Iterating HashMap after removal");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //key-value pair based removal
        map.remove(2,"Apple");
        System.out.println("Iterating HashMap after removal");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Replace
        map.replace(3, "Apple");
        map.replace(4, "Grapes", "Orange");
        System.out.println("Iterating HashMap after replacement");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            }

        map2.replaceAll((k,v) -> "Apple");
        System.out.println("Iterating HashMap2 after replacement");
        for(Map.Entry m : map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            }
            
    }
}
