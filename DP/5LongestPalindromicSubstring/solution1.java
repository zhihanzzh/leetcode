class Solution {
    int lo;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        
        if (n == 1) {
            return s;
        }
        
        for (int i = 0; i < n; i++) {
            travels(s, i, i);
            travels(s, i, i + 1);
        }
        
        String res = s.substring(lo, lo + maxLen);
        return res;
        
    }
    
    private void travels(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        
        if (r - l - 1 > maxLen) {
            lo = l + 1;
            maxLen = r - l -1;
        }
    }
}