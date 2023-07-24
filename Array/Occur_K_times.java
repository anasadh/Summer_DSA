package Summer_DSA.Array;

import java.util.*;

public class Occur_K_times{

    public static void main(String args[]){
        // System.out.println("heuyy");
        int a[] = {1,4,7,3,4,2,7};
        int n=7;
        int k=2;
        System.out.println(firstElementKTime(a,n,k));
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j])
                c++;
            }
            // System.out.println(a[i]+" "+  c +" ");
            if(c==k){
            // System.out.println(a[i]);
            return a[i];
            // break;
        }
        }
        return -1;
    } 
}