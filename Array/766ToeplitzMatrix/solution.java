class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = matrix.length - 2; i >= 0; i--) {
            int r = i;
            int c = 0;
            int prev = 0;
            int cur = matrix[r][c];
            while (c <= matrix[0].length - 1 && r <= matrix.length - 1) {
                prev = cur;
                cur = matrix[r][c];
                if (prev != cur) {
                    return false;
                }
                c++;
                r++;
            }
        }
        
        for (int i = matrix[0].length - 2; i > 0; i--) {
            int r = 0;
            int c = i;
            int prev = 0;
            int cur = matrix[r][c];
            while (c <= matrix[0].length - 1 && r <= matrix.length - 1) {
                prev = cur;
                cur = matrix[r][c];
                if (prev != cur) {
                    return false;
                }
                c++;
                r++;
            }
        }
        
        return true;
    }
}