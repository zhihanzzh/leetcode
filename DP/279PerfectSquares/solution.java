class Solution {
    public int numSquares(int n) {
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE - 1);
        res[0] = 0;
        for (int i = 1; i*i <= n; i++) {
            res[i * i] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                    res[i + j * j] = Math.min(res[i] + 1, res[i + j * j]);
            }
        }
        return res[n];
        
    }
}