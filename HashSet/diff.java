package Summer_DSA.HashSet;
import java.util.*;

public class diff {
    public static void main(String[] args) {
        
        String A = "geeksforgeeks";
        String B = "geeksquiz";
    

        Set<Character> s1 = new HashSet<>();
        for(int i=0;i<A.length();i++){
        s1.add(A.charAt(i));
        }

        Set<Character> s2 = new HashSet<>();
        for(int i=0;i<B.length();i++){
        s2.add(B.charAt(i));
        }

        Set<Character> u = new HashSet<>(s1);
        u.addAll(s2);

        Set<Character> i = new HashSet<>(s1);
        i.retainAll(s2);


        Set<Character> diff = new HashSet<>(u);
        diff.removeAll(i);

        if(diff.size()==0)
        System.out.println("-1");
        // System.out.println(diff);

        String str = diff.toString();
        str = str.replaceAll("[\\[\\],]","");
        str = str.replaceAll("\\s", "");
        System.out.println("str is:"+ str);

        char temp[] = str.toCharArray();
        Arrays.sort(temp);

        System.out.println(temp);

    }
}
