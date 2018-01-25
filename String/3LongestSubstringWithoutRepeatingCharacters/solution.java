class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        int l = 0;
        int r = 0;
        int max = 0;
        int[] map = new int[256];
        
        while(r < s.length()) {
            l = map[s.charAt(r)] > 0 ? Math.max(l, map[s.charAt(r)]) : l;
            map[s.charAt(r)] = r + 1;
            max = Math.max(max, r - l + 1);
            r++;
        }
        
        return max;
    }
}