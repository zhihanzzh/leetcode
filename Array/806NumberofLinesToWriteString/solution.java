class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        if (S.length() == 0 || S == null) {
            return new int[]{0, 0};
        }
        
        int countLines = 1;
        int cur = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (widths[S.charAt(i) - 'a'] <= 100 -cur) {
                cur += widths[S.charAt(i) - 'a'];
            } else {
                cur = widths[S.charAt(i) - 'a'];
                countLines++;
            }
        }
        
        int[] res = {countLines, cur};
        return res;
    }
}