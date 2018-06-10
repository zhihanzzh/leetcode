class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] res = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        int n = res.length;
        for (int i = 0; i < res[n - 1].length; i++) {
            res[n - 1][i] = triangle.get(n - 1).get(i);
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                res[i][j] = Math.min(res[i + 1][j + 1], res[i + 1][j]) + triangle.get(i).get(j);
            }
        }
        return res[0][0];
    }
    
}