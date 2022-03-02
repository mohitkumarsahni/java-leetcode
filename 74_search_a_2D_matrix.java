public class Main {
    public static void main(String[] args) {
        int target = 61;
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("is the target present in the 2D matrix: "+searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++) {
            if (binarySearch(target, matrix, 0, n-1, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int target, int[][] matrix, int leftIndex, int rightIndex, int searchInRow) {
        if (rightIndex >= leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex)/2;
            if (matrix[searchInRow][mid] == target) {
                return true;
            } else if (matrix[searchInRow][mid] > target) {
                return binarySearch(target, matrix, leftIndex, mid - 1, searchInRow);
            } else if (matrix[searchInRow][mid] < target) {
                return binarySearch(target, matrix, mid + 1, rightIndex, searchInRow);
            }
        }
        return false;
    }
}
