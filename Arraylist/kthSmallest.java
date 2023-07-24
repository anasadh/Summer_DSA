package Summer_DSA.Arraylist;
import java.util.*;

public class kthSmallest {
    
    
public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
    
    // HashSet<Integer> set = new HashSet<>();
    // for(int i=0;i<n;i++){
    //         int s = range[i][0];
    //         // set.add(s);
    //         int k = range[i][1];
    //         while(!set.contains(k) || !set.contains(s)){
    //             set.add(s);
    //             s=s+1;
    //         }
    // }
    // ArrayList<Integer> arr = new ArrayList<>(set);
    // Collections.sort(arr);
    
    
    // System.out.println(set);
    // ArrayList<Integer> result = new ArrayList<Integer>(q);
    //     for(int i=0;i<q;i++){
    //         if(queries[i]<=arr.size())
    //         result.add(arr.get(queries[i]-1));
    //         else
    //         result.add(-1);
    //     }

    //     return result;
    // code here

    List<Integer> numbers = new ArrayList<>();
    
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                numbers.add(i);
            }
        }


}

public static void main(String[] args) {
    int n=3;
    int range[][] = {{9,10}, {2,10} ,{5,14}};
    int queries[] = {2};
    int q = queries.length;

    ArrayList<Integer> result = new ArrayList<Integer>();
    result= kthSmallestNum(n, range, q, queries);
    System.out.println(result);
}
}

