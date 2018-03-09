class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder tmp = new StringBuilder(A);
        int q = 1;
        for(;tmp.length() < B.length();q++) {
            tmp.append(A);
        }
        if(tmp.indexOf(B) >= 0) return q;
        if(tmp.append(A).indexOf(B) >= 0) return q + 1;
        return -1;
    }
}