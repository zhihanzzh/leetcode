public int getMaxLength(int r, int c, int[][] grid) {
    if (grid[r][c] != 1 ) {
        return 0;
    }
    grid[r][c] = 0;
    // get top
    int top = r>0?this.getMaxLength(r-1,c,grid):0;
    int left = c>0?this.getMaxLength(r,c-1,grid):0;
    int right = c+1<grid[r].length?this.getMaxLength(r,c+1,grid):0;
    int bottom = r+1<grid.length?this.getMaxLength(r+1,c,grid):0;
    return 1+top+left+right+bottom;
}