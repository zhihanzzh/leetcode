class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, count(grid, seen, i, j));
            }
        }
        
        return max;
    }
    
    private int count(int[][] grid, boolean[][] seen, int h, int v) {
        if (h < 0 || h >= grid.length || v < 0 || v >= grid[0].length || seen[h][v] || grid[h][v] == 0) {
            return 0;
        }
        seen[h][v] = true;
        return (1 + count(grid, seen, h - 1, v) + count(grid, seen, h + 1, v) + count(grid, seen, h, v - 1) + count(grid, seen, h, v + 1));
    }
}