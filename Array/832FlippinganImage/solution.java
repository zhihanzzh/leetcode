class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int l = 0;
            int r = A[i].length - 1;
            while (l < r) {
                int tmp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = tmp;
                A[i][r] = A[i][r] ^ 1;
                A[i][l] = A[i][l] ^ 1;
                l++;
                r--;
            }
            
            if (l == r) {
                A[i][l] = A[i][l] ^ 1;
            }
        }
        
        return A;
    }
}