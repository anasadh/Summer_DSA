package Summer_DSA.recursion;
import java.util.*;

public class subseq_sumK {

    public static int printSubsequences(int i, ArrayList<Integer> A, int arr[], int n, int k, int sum, int c) {
        if (i >= n) {
            if (sum == k) {
                System.out.println(A);
                // c++;
                return 1;
            }
            return 0;
        }
    
        A.add(arr[i]);
        sum += arr[i];
        int l = printSubsequences(i + 1, A, arr, n, k, sum, c);
    
        A.remove(A.size() - 1);
        sum -= arr[i];
        int r = printSubsequences(i + 1, A, arr, n, k, sum, c);
    
        return l+r;
    }
    
    public static void main(String[] args) {
        int arr[] = { 3,1,2 , 5, 4,};
        int n = arr.length;
        int k = 5;

        ArrayList<Integer> A = new ArrayList<Integer>();
         System.out.println(printSubsequences(0,A,arr,n,k,0,0));
         System.out.println("completed");;
    }
}
