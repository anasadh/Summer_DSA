package Summer_DSA.HashSet;

import java.util.*;

public class set{

    public static void main(String args[]){
        Set<String> set = new HashSet<String>();

        set.add("Anamika");
        set.add("is");
        set.add("my");
        set.add("name.");

        //print hashset
        System.out.println("Hashset contains: "+ set);
        //or
        for(String element :set)
        System.out.println(element);

        //find value of particular index let 3
        int currentIndex=0;
        for(String element :set){
            if(currentIndex==3)
            System.out.println("value at index 3 is:"+ element);
            currentIndex++;
        }


        //convert set to array
        String[] arr = set.toArray(new String[set.size()]);

        for(int i=0;i<set.size();i++)
        System.out.println(arr[i]+" ");

        //convert set to ArrayList
        List<String> list = new ArrayList<String>(set);
        System.out.println("element at index 3 is :"+ list.get(3));
    }
}