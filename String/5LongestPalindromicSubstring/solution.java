class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];
        
        int l = 0;
        int r = 0;
        
//         for (int j = 1; j < s.length(); j++) {
//             for (int i = 0; i < j; i++) {
//                 if (s.charAt(i) == s.charAt(j) && (j - i < 3 || isPalindrome[i + 1][j - 1])) {
//                     isPalindrome[i][j] = true;
                    
//                     if (j - i > r - l) {
//                         l = i;
//                         r = j;
//                     }
//                 }
//             }
//         }
        
        
//         return s.substring(l, r + 1);
        
        for (int i = 0; i < s.length(); i++) {
            isPalindrome[i][i] = true;
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                l = i;
                r = i + 1;
            }
        }
        
        for (int length = 3; length <= s.length(); length++) {
            for (int i = 0; i + length - 1 < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i + length - 1) && isPalindrome[i + 1][i + length - 2]) {
                    isPalindrome[i][i + length - 1] = true;
                    l = i;
                    r = i + length - 1;
                }
            }
        }
        
        return s.substring(l, r + 1);
    }
}
