package Summer_DSA.MATRIX;

public class rotate_by_nintyd {
    public static void main(String[] args) {
        int m[][] = { { 1,2,3,4},
                      { 5,6,7,8},       
                      { 9,10,11,12},
                      { 13,14,15,16}
                    };
                    
        int n = 4;
        int r[][] = new int[n][n];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        //rotate the matrix by 90 degreee using brute force approach

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                r[j][n-1-i] = m[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
