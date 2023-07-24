import java.util.*;

public class basic{

      static int i=0;
    public static void printName(int n){
        if(n<0)
        return;
        System.out.println(n);
        printName(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        printName(n);
    }
}