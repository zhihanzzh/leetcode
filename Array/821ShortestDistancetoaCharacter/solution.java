class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        
        int prev =  -10001;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            
            ans[i] = i - prev;
        }
        
        prev = 20001;
        
        for (int i = S.length() -1 ; i >= 0; i--) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            
            ans[i] = Math.min(ans[i], prev - i);
        }
        
        return ans;
    }
}