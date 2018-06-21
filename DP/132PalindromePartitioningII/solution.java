class Solution {
    private boolean[][] getPalindrome(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        
        for (int i = 0; i < n - 1; i++) {
            isPalindrome[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
        }
        
        for (int length = 2; length < n; length++) {
            for(int i = 0; i + length < n; i++) {
                isPalindrome[i][i + length] = isPalindrome[i + 1][i + length - 1] && s.charAt(i) == s.charAt(i + length);
            }
        }
        return isPalindrome;
    }
    public int minCut(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        boolean[][] isPalindrome = getPalindrome(s);
        int[] cut = new int[s.length() + 1];
        
        cut[0] = 0;
        for (int i = 1; i <= s.length(); i++) {
            cut[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                if (isPalindrome[i - j][i - 1] && cut[i- j] != Integer.MAX_VALUE) {
                    cut[i] = Math.min(cut[i], cut[i - j] + 1);
                }
            }
        }

        for (int i = 0; i < cut.length; i++) {
            System.out.println(cut[i]);
        }
        return cut[s.length()] - 1;
    }
}