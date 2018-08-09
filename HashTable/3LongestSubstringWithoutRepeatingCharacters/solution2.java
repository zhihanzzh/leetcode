class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int left = 0;
        int right = 1;
        int len = 1;
        int max = 1;
        while (right < s.length()) {
            String tmp = s.substring(left, right);
            if (tmp.indexOf(s.charAt(right)) >= 0) {
                left = left + tmp.indexOf(s.charAt(right)) + 1;
                len = right - left + 1;
            } else {
                len++;
                max = Math.max(max,len);
            }
            right++;
        }
        return max;
    }
}