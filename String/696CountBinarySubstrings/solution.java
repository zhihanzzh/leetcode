class Solution {
    public int countBinarySubstrings(String s) {
        if (s.length() == 1) {
            return 0;
        }
        
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                groups[t]++;
            } else {
                t++;
                groups[t]++;
            }
        }
        
        int res = 0;
        
        for(int i = 0; i < t; i++) {
            res += Math.min(groups[i], groups[i + 1]);
        }
        
        return res;
    }
}