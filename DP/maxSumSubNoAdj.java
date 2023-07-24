public class maxSumSubNoAdj {
    public static int printSubsequences(int i,int arr[],int n){
        if(i>=n)
        return 0;
        // pic the particular index into the subsequences
        int pick = printSubsequences(i+2,arr,n) + arr[i];

        // not pic the particular index into the subsequences
        int npick = printSubsequences(i+1,arr,n);
      
        return Math.max((pick), (npick));
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = arr.length;
        int res = printSubsequences(0,arr,n);
        System.out.println(res);
    }
}
