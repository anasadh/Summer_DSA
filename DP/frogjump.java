import java.util.*;

public class frogjump {
    // Memoization
    public static int frogJumpn(int n, int arr[], int k, int[] memo) {
        if (n == 0)
            return 0;

        if (memo[n] != -1)
            return memo[n];

        int mmsteps = Integer.MAX_VALUE;
        for (int i = 1; i <= k && n - i >= 0; i++) {
            int jump = frogJumpn(n - i, arr, k, memo) + Math.abs(arr[n] - arr[n - i]);
            mmsteps = Math.min(mmsteps, jump);
        }

        memo[n] = mmsteps;
        return mmsteps;
    }

     // Tabulation (Bottom-up)
    public static int frogJumpTabulation(int n, int arr[], int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k && i - j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(arr[i] - arr[i - j]));
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {15, 20, 10, 50,50,100,10,30,20,10};
        int n = arr.length;
        int k = 5;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        int res = frogJumpn(n - 1, arr, k, memo); // Start with n-1, as arrays are 0-indexed
        System.out.println(res);
        int res2 = frogJumpTabulation(n, arr, k);
        System.out.println(res2);
    }
}

