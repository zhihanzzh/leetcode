class Solution {
    public String countAndSay(int n) {
        
        int count;
        char say;
        
        String cur = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            say = cur.charAt(0);
            count = 1;
            
            for (int j = 1; j < cur.length(); j++) {
                if (cur.charAt(j) != say) {
                    sb.append(count).append(say);
                    say = cur.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            sb.append(count).append(say);
            cur = sb.toString();
        }
        
        return cur;
    }
}