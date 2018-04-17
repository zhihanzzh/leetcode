class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "").toUpperCase();
        if(S.length() == 0) {
            return "";
        }
        
        StringBuilder tmp = new StringBuilder();
        
        int i = S.length();
        for(; i > K; i-= K) {
            tmp.insert(0, S.substring(i - K, i));
            tmp.insert(0, "-");
        }
        
        if( i > 0) {
            tmp.insert(0, S.substring(0, i));
            return tmp.toString();
        } else {
            tmp.deleteCharAt(0);
            return tmp.toString();
        }
    }
}