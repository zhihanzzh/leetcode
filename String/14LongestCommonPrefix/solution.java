class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String pattern = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pattern) != 0) {
                pattern = pattern.substring(0, pattern.length() - 1);
            }
        }
        
        return pattern;
    }
}