import java.util.*;
public class fibinacci {
    
    // recursion to dp  - sc - O(n)+O(n)
    public static int fibonacci(int n,ArrayList<Integer> dp){
        if(n<=1)
        return n;

        // step 2- to check the condition if it has been calculated or not
        if(dp.get(n) != -1)
        return dp.get(n);

        // step 3- store the result in dp arraylist
        int fib =  fibonacci(n-1, dp) + fibonacci(n-2, dp);
        dp.set(n,fib);
        return fib;
    }

    // recursion to tabulation -  sc - O(n)
    public static int fibonacci1(int n,ArrayList<Integer> dp){
        if(n<=1)
        return n;

        // step 2- to check the condition if it has been calculated or not
        if(dp.get(n) != -1)
        return dp.get(n);

        // step 3- store the result in dp arraylist
        int fib =  fibonacci(n-1, dp) + fibonacci(n-2, dp);
        dp.set(n,fib);
        return fib;
    }


    public static void main(String[] args) {
        int n = 5;
        // step 1 - make a dp arraylist to store the values of f(n)
        ArrayList<Integer> dp= new ArrayList<>(Collections.nCopies(n + 1, -1));
        int res = fibonacci(n,dp);
        System.out.println(res);

        // recursion to tabulation
        // step 1
        int dparr[] = new int[n+1];
        // step 2
        dparr[0] =0;
        dparr[1] =1;
        // step 3
        for (int i = 2 ;i <= n; i++ )
        dparr[i]=dparr[i-1]+dparr[i-2];
        //step 4 print value at index 'n' which is nth term Fibonacci series
        System.out.println(dparr[n]);


        // third mehtod (space optimization) - spcae complexity - O(1)
        int prev2 = 0, prev1 = 1;
        int cur = 0;
        for (int i = 2 ;i <= n; i++ ){
        cur = prev2+prev1;
        prev2 = prev1;
        prev1 =cur;
        }
        System.out.println(prev1);
    }
}
