import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] mat = new int[][]{{1,2,3,4},{5,6,7,8}};
        int r = 4, c = 2;

        System.out.println("Reshaped matrix: "+ Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int k = 0, l = -1;

        int[][] result = new int[r][c];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j< n; j++) {
                if (l < c) {
                    l++;
                }
                if (l == c) {
                    k++;
                    l = 0;
                }
                result[k][l] = mat[i][j];
            }
        }
        return result;
    }
}
