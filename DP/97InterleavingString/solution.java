class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] res = new boolean[s2.length() + 1][s1.length() + 1];
        res[0][0] = true;
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        for (int i = 1; i < res[0].length; i++) {
            if (res[0][i - 1] && s1.charAt(i - 1) == s3.charAt(i - 1)) {
                res[0][i] = true;
            }
        }
        
        for (int i = 1; i < res.length; i++) {
            if (res[i - 1][0] && s2.charAt(i - 1) == s3.charAt(i - 1)) {
                res[i][0] = true;
            }
        }
        
        for (int i = 1; i < res.length; i++) {
            for (int j = 1; j < res[0].length; j++) {
                if (res[i - 1][j] && (s2.charAt(i - 1) == s3.charAt(i + j - 1)) || res[i][j - 1] && (s1.charAt(j - 1) == s3.charAt(j + i - 1))) {
                    res[i][j] = true;
                }
            }
        }
        
        return res[s2.length()][s1.length()];
    }
}