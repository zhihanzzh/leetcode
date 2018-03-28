class Solution {
    public String longestPalindrome(String s) {
        boolean[][] res = new boolean[s.length()][s.length()];
        
        
        int maxS = 0;
        int maxL = 1;
        for (int i = 0; i < s.length(); i++) {
            res[i][i] = true;
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                res[i-1][i] = true;
                maxS = i - 1;
                maxL = i + 1;
            }
        }
        
        int gap = 1;
        while (gap <= s.length() - 1) {
            for (int i = 0; i < s.length() - gap - 1; i++) {
                if (s.charAt(i) == s.charAt(i + gap + 1) && res[i + 1][i + gap]) {
                    res[i][i + gap + 1] = true;
                    maxS = i;
                    maxL = i + gap + 2;
                }
            }
            gap++;
        }
        
        return s.substring(maxS, maxL);
    }
}