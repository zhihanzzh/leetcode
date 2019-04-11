class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - i - 1);
        }
        return res;
    }
}
