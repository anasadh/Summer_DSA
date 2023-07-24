package Summer_DSA.recursion;

import java.util.*;

public class reverseArr {

    // 2 pointers method

    // public static void reverse(int arr[],int l,int r){
    //     if (l >= r )
    //     return;

    //     int t = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = t;

    //     reverse(arr, l+1, r-1);
    // }


    // 1 pointer method

    public static void reverse(int arr[],int id,int n){
       
        if(id>=(n/2))
        return;

        int t = arr[id];
        arr[id] = arr[n-1-id];
        arr[n-1-id] = t;
        
        reverse(arr, id+1,n);
    }
    
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        int n = as.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = as.nextInt();

        // reverse(arr,0,n-1);
        reverse(arr,0,n);

        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        as.close();
        
    }
}
