package Summer_DSA.recursion;

public class frogJump {
    
    public static int frogJumpn(int n, int arr[], int left, int right) {
        if (n == 0)
            return 0;
        
        // Base case for one stone remaining
        if (n == 1)
            return left;

        int leftJump = frogJumpn(n - 1, arr, left, right) + ((arr[n-1]>arr[n-2]) ? arr[n - 1] - arr[n - 2] :  arr[n - 2] - arr[n - 1]);
        int rightJump = frogJumpn(n - 3, arr, left, right) + ((arr[n-1]>arr[n-3]) ? arr[n - 1] - arr[n - 3] :  arr[n - 3] - arr[n - 1]);

        return Math.min(leftJump, rightJump);
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 10};
        int n = arr.length;
        int res = frogJumpn(n, arr, 0, 0);
        System.out.println(res);
    }
}
