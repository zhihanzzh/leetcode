class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return helper(matrix, target, 0, matrix[0].length - 1);
    }
    
    private boolean helper(int[][] matrix, int target, int m, int n) {
        if (m >= matrix.length || n < 0) {
            return false;
        }
        int p = matrix[m][n];
        if (target < p) {
            return helper(matrix, target, m, n - 1);
        } else if (target > p) {
            return helper(matrix, target, m + 1, n);
        } else {
            return true;
        }
    }
}
