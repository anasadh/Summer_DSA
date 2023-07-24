package Summer_DSA.HashMap;
import java.util.*;

import java.util.HashMap;

public class equalArrays {

    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,1,4,5};
        int n=5;

        //hashmap
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(map.get(arr1[i])==null)
            map.put(arr1[i], 1);
            else
            {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i],count);
            }
        }

        // Traverse arr2[] elements and check if all
        // elements of arr2[] are present same number
        // of times or not.
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr2[i])){
            System.out.println("not equal");
            break;}

            if(map.get(arr2[i])==0){
                System.out.println("not equal");
                break;}
            
            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }

        System.out.println("equal");

    }
}
