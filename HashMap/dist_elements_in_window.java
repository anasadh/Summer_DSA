package Summer_DSA.HashMap;
import java.util.*;

public class dist_elements_in_window {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,1,3};
        int n = a.length;
        int k=4;

        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        //1st window
        int c=0;
        for(int i=0;i<k;i++){
           if(map.get(a[i])==null)
           map.put(a[i], 1);
           else
           {
             c = map.get(a[i]);
             c++;
             map.put(a[i], c);
           }
        }
        res.add(map.size());
        System.out.println(map);
        

        //slide the window and update
        for(int i=k;i<n;i++){

            //remove left
            c = map.get(a[i-k]);
            if(c==1)
            map.remove(a[i-k]);
            else{
                c--;
                map.put(a[i-k], c);
            }

           //add right
            if(map.get(a[i])==null){
                map.put(a[i], 1);
            }
            else
            {
                c = map.get(a[i]);
                c++;
                map.put(a[i], c);   
            }

            res.add(map.size());
            System.out.println(map);
        }
        
        for(int i=0;i<res.size();i++)
        System.out.print(res.get(i)+" ");

    }
}

