package Summer_DSA.recursion;
import java.util.*;

public class palindrome {

    public static boolean isPalindrome(String s,int i,int n){

        if(s.charAt(i) != s.charAt(n-1-i))
        return false;

        if(i>=(n/2))
        return true;

        return isPalindrome(s, i+1, n);
    }
    public static void main(String[] args) {
        String s = "12345321";
        int n = s.length();
        if (isPalindrome(s, 0, n))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
