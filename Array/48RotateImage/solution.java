class Solution {
    public void rotate(int[][] matrix) {
        int tmp = 0;
        int n = matrix.length - 1;
        for (int l = 0; l <= n / 2; l++) {
            for(int i = l; i < n - l; i++) {
                tmp = matrix[l][i];
                matrix[l][i] = matrix[n - i][l];
                matrix[n - i][l] = matrix[n - l][n -i];
                matrix[n - l][n -i] = matrix[i][n -l];
                matrix[i][n -l] = tmp;
            }
        }
    }
}