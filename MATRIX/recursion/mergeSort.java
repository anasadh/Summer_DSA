package Summer_DSA.recursion;

import OOPS.staticClass;

public class mergeSort {

    public static void concquer(int l,int m,int r,int arr[]){

        int mergedArr[] = new int[r-l+1];
        int x =0; 
        int id1 = l;
        int id2 = m+1;

        while(id1 <= m && id2 <= r){
            if(arr[id1] <= arr[id2])
            mergedArr[x++] = arr[id1++];
            else
            mergedArr[x++] = arr[id2++];
        }
        
        while(id1<=m)
         mergedArr[x++] = arr[id1++];

        while(id2<=r)
         mergedArr[x++] = arr[id2++];     
         
        for(int i=0,j=l;i<mergedArr.length;i++,j++)
        arr[j]=mergedArr[i];
    }

    public static void divide(int l,int r,int arr[]){

        if(l>=r)
        return;

        int mid = l-((l-r)/2);
        divide(l, mid,arr);
        divide(mid+1,r,arr);
        concquer(l,mid,r,arr);
    }
    public static void main(String[] args) {
        int arr [] ={5,3,8,4,5,1,9,2,0};
        int n = arr.length;

        divide(0, n-1, arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
