package Summer_DSA.Array;

import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int n=5,k=3,p,t,x=k/2;

        for(int i=0;i<n;i=i+k){

            int j=i;

            if(i+k < n){
            while(j!=x){
            p=0;
            t = arr.get(j);
            arr.set(j, arr.get(i+k-1-p));
            arr.set(i+k-1-p,t);
            j++;
            }
            x=x+k;
            }

            else
            {
                x=0;
                while(x!=(n%k)/2){
                p=0;
                // t = arr[j];
                // arr[j] = arr[n-1-p];
                // arr[n-1-p] = t;
                t = arr.get(j);
                arr.set(j,arr.get(n-1-p));
                arr.set(n-1-p, t);
                j++;
                x++;
                }
            }
        }

        System.out.println("final array:");
        for(int i=0;i<n;i++){
        System.out.println(arr.get(i));
        }
    }
}
