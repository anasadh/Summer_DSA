package Summer_DSA.String;

public class subsequences {
    public static void main(String[] args) {
        String s = "abcd";
        int n  = 4;

        for(int i=0;i<Math.pow(2, n);i++){
           StringBuilder ts = new StringBuilder("");
            for(int j=0;j<n;j++){
                if((i & (1<<j)) != 0)
               ts.append(s.charAt(j));
            }
            System.out.println(ts);
        }

    }
}
