package Summer_DSA.Array;

import java.util.ArrayList;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class min_index_char {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";

        int m = str.length();
        int n = patt.length();

        ArrayList<Integer> arr =  new ArrayList<>();
        if(m>n){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(patt.charAt(i)==str.charAt(j)){
                        arr.add(j);
                        break;
                }
            }
        }

        if(arr.size()==0)
        System.out.println("-1");
        else{
        Collections.sort(arr);
        System.out.println(arr.get(0));
        }
        
    }
}
}