class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, count(grid, i, j));
            }
        }
        
        return max;
    }
    
    private int count(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        } else {
            grid[i][j] = 0;
            return 1 + count(grid, i - 1, j) + count(grid, i, j - 1) + count(grid, i + 1, j)  + count(grid, i, j + 1);
        }
    }
}