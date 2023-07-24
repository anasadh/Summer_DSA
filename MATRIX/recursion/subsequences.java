package Summer_DSA.recursion;
import java.util.*;

public class subsequences {

    public static boolean printSubsequences(int i, ArrayList<Integer> A,int arr[],int n,int k,int sum){
        if(i>=n){
            if(sum==k){
                 System.out.println(A);
                return true;
            }
           return false;
        }

        // pic the particular index into the subsequences
        A.add(arr[i]);
        sum += arr[i];
        if(printSubsequences(i+1,A,arr,n,k,sum))
        return true;

        // not pic the particular index into the subsequences
        A.remove(A.size()-1);
        sum -= arr[i];
        if(printSubsequences(i+1,A,arr,n,k,sum))
        return true;

        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 3,1,2 , 5, 4,};
        int n = arr.length;
        int k = 5;

        ArrayList<Integer> A = new ArrayList<Integer>();
         if(printSubsequences(0,A,arr,n,k,0))
         System.out.println("completed");;
    }
}
