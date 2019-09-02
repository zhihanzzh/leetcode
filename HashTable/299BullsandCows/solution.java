class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] buckets = new int[10];

        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        for (int i = 0; i < s.length; i++) {
            buckets[s[i] - 48]++;
        }

        for (int i = 0; i < g.length; i++) {
            if (g[i] == s[i]) {
                buckets[g[i] - 48]--;
                bulls++;
            }
        }
        
        for (int i = 0; i < g.length; i++) {
            if (g[i] != s[i] && buckets[g[i] - 48] > 0) {
                    cows++;
                    buckets[g[i] - 48]--;
            }
        }

        String rs = bulls + "A" + cows + "B";

        return rs;
    }
}