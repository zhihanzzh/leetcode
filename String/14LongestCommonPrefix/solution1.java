public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String longestCP = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < Math.min(longestCP.length(),strs[i].length()); j++) {
                if (strs[i].charAt(j) != longestCP.charAt(j)) break;
            }
            longestCP = longestCP.substring(0,j);
        }
        return longestCP;
    }
}