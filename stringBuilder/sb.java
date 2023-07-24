package Summer_DSA.stringBuilder;
import java.util.*;

public class sb {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Ana");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        // set char at index  0  
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // insert at index 0 
        sb.insert(3,'m');
        System.out.println(sb);

        // delete the extra 'm' 
        sb.delete(3,4); //end index is exclusive 
        System.out.println(sb);

        // append -  last me jodna
        sb.append("m");
        System.out.println(sb);

        // length
        System.out.println(sb.length());    
    }
}
