package Summer_DSA.Array;

import java.util.*;
// import java.util.Collection;

public class missing{

    public static void main(String args[]){
        int array[] = {1,3,2,5};
        int r = missingNumber(array,5);
        System.out.println(r);
    }
    static int missingNumber(int array[], int n) {
    
        Arrays.sort(array);  
        for(int i=0;i<n-1;i++){
            System.out.println(array[i]);
        } 
        for(int i=0;i<n-2;i++){
            System.out.println(array[i]);
            if(array[i]!=(array[i+1]+1)){
                System.out.println("yes");;
            return array[i]+1;
            }
        }
        return -1;
    }
}