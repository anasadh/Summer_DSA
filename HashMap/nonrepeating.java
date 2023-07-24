package Summer_DSA.HashMap;
import java.util.*;

public class nonrepeating{

    public static void main(String args[]){
        String s = "hollhe";
        int n = s.length();
        HashMap<Character, Integer> map=new  HashMap<>();
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
            map.put(c,map.get(c)+1);
            else
            map.put(c,1);
        }

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.get(c)==1)
            System.out.println(c);
        }
    }

}

// find the first non repeating character of string in java using hashmap?