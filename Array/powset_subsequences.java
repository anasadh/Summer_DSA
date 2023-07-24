package Summer_DSA.Array;
import java.util.*;

public class powset_subsequences {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n=  arr.length;

        for(int i=0;i<Math.pow(2, n);i++){
            ArrayList<Integer> l = new  ArrayList<Integer>();
            for(int j=0;j<n;j++){
                if((i & (1<<j)) != 0)
                l.add(arr[j]);
            }
            System.out.println(l);
        }
    }
}
