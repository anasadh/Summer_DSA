public class backtracking {

    public static void btprintincr(int i,int n){
        if(i<1)
        return ;

        btprintincr(i-1,n);
        System.out.print(i+" ");
    }
    public static void btprintdecr(int i,int n){
        if(i>n)
        return ;

        btprintdecr(i+1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        btprintincr(3,3);
        System.out.println();
        btprintdecr(1,3);
    }
}
