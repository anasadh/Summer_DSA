import java.util.HashMap;
import java.util.Map;

public class common_elements {
    public static void printCommonElements(int mat[][]) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!map.containsKey(mat[j][i])) {
                    map.put(mat[j][i],1);
                }
                else
                {
                    map.put(mat[j][i],map.get(mat[j][i])+1);
                }
            }
        }

        for (int e : map.keySet()) {
            System.out.println(e);
            System.out.println();
            System.out.println(map.get(e));
            System.out.println();
           if(map.get(e)==n)
           System.out.println(map.keySet());
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 1, 4},
            {3, 7, 8, 5},
            {8, 7, 7, 3},
            {8, 1, 2, 7},
        };

        printCommonElements(mat);
    }
}
