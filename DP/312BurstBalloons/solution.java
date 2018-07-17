class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] res = new int[n + 2][n + 2];
        
        int[] nNums = new int[n + 2];
        nNums[0] = 1;
        nNums[n + 1] = 1;
        for (int i = 1; i < n + 1; i++) {
            nNums[i] = nums[i - 1];
        }
        
        for (int l = 1; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k <= j; k++) {
                    res[i][j] = Math.max(res[i][j], res[i][k - 1] + nNums[i - 1] * nNums[k] * nNums[j + 1] + res[k + 1][j]);
                }
            }
        }
        
        return res[1][n];
    }
}