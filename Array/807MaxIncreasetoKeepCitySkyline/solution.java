class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] tb = new int[grid[0].length];
        int[] lr = new int[grid.length];
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > tb[j]) {
                    tb[j] = grid[i][j];
                }
                if (grid[i][j] > lr[i]) {
                    lr[i] = grid[i][j];
                }
            }
        }
        
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                //grid[i][j] = Math.min(tb[j], lr[i]);
                sum += Math.min(tb[j], lr[i]) - grid[i][j];
            }
        }
        return sum;
        
    }
}