class Solution {
    private int getMaxlength(List<String> wordDict) {
        int max = 0;
        for (String s : wordDict) {
            max = Math.max(max, s.length());
        }
        return max;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxLength = getMaxlength(wordDict);
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= maxLength && j <= i; j++) {
                if (res[i - j] && wordDict.contains(s.substring(i - j, i))) {
                    res[i] = true;
                    break;
                }
            }
        }
        
        return res[s.length()];
    }
}