package Summer_DSA.recursion;

public class longestPalindrome
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        StringBuilder sb = new StringBuilder();
        return longestSubseq(0,S,n,0,sb);
        
    }
    
    public static boolean palindrome(String s,int i,int n){
        if(s.charAt(i) != s.charAt(n-1-i))
        return false;
        
        if(i>=(n/2))
        return true;
        
        return palindrome(s,i+1,n);
    }
    
    public static int longestSubseq(int i, String s,int n,int maxl,StringBuilder sb){
        if(i>=n){
            if(palindrome(sb.toString(),0,sb.length())){
                if(sb.length()>maxl)
                maxl = sb.length();
            }
        }
        // pic
        sb.append(s.charAt(i));
        maxl= longestSubseq(i+1,s,n,maxl,sb);
        // not pic
        sb.deleteCharAt(sb.length() - 1);
        maxl = longestSubseq(i+1,s,n,maxl,sb);
        
        return maxl;
    }

    public static void main(String[] args) {
        String s = "abccba";
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int res = longestSubseq(0, s, n, 0, sb);
        System.out.println(res);
    }
}