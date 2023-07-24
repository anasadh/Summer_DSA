public class climbingStairs {

    // no of ways 
    public static int numOfWays(int n){
        if (n ==0  || n==1){
            return 1;
        } 

        int l = numOfWays(n-1);
        int r = numOfWays(n-2);
        return l+r;
    }
    // no of ways using dp (memoization)
    public static int numOfWaysdp(int n,int dp[]){
        if (n ==0  || n==1){
            return 1;
        } 

        if(dp[n] != 0)
        return dp[n];

        int l = numOfWaysdp(n-1,dp);
        int r = numOfWaysdp(n-2,dp);
        return dp[n] = l+r;
    }

    // min cost using recursion
    public static int mincostRec(int id, int arr[]){
        if (id ==0  || id==1){
            return arr[id];
        } 

        int l = mincostRec(id-1,arr) + arr[id];
        int r = mincostRec(id-2,arr) + arr[id];
        return Math.min(l,r);
    }

    // min cost  (Tabulation)
    public static int minCost(int n, int[] arr) {
       
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + arr[i];
        }

        return dp[n-1];
    }
    // min cost  (Tabulation - space optimization)
    public static int minCostSO(int n, int[] arr) {
        int prev = arr[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int cur = Math.min(prev,prev2) + arr[i];
            prev2 = prev;
            prev  = cur;
        }
        return prev;
    }

    public static void main(String[] args) {
        // staisrs are 3, but we are standing on ground so n=4
        int arr[] = {1,3,1,4};
        int n = arr.length;
        int dp[] = new int[n+1];

        System.out.println(numOfWays(n));
        System.out.println(numOfWaysdp(n,dp));
        System.out.println(mincostRec(n-1, arr));
        System.out.println(minCost(n, arr));
        System.out.println(minCostSO(n, arr));
    }
}
