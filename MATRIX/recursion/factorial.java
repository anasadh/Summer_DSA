public class factorial {
    
    public static void parametericWay(int n,int ans){
        if(n == 0){
             System.out.println(ans);
             return ;
        }
        ans = ans * n;
        parametericWay(n-1,ans);
    } 

    public static int functionalWay(int n){
        if(n==1)
        return 1;

        return n*functionalWay(n-1);
    } 
    public static void main(String[] args) {
        int n= 5;
        parametericWay(n,1);
        System.out.println();
        System.out.println(functionalWay(n));
    }
}
