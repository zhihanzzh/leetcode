class Solution {
    public int numDistinct(String s, String t) {
        int[][] res = new int[t.length() + 1][s.length() + 1];

        for (int i = 0; i < res[0].length; i++) {
            res[0][i] = 1;
        }
        
        for (int i = 1; i < res.length; i++) {
            for (int j = 1; j < res[0].length; j++) {
                if(t.charAt(i - 1) == s.charAt(j - 1)) {
                    res[i][j] = res[i - 1][j - 1] + res[i][j - 1];
                } else {
                    res[i][j] = res[i][j - 1];
                }
            }
        }
        
        return res[t.length()][s.length()];
    }
}