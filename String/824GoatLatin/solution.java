class Solution {
    public String toGoatLatin(String S) {
        String[] tmp = S.split(" ");
        String vowel = "aeiouAEIOU";
        String a = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        for (int i = 0; i < tmp.length; i++) {
            if (vowel.indexOf(tmp[i].charAt(0)) >= 0) {
                StringBuilder sb = new StringBuilder(tmp[i]);
                sb.append("ma");
                sb.append(a.substring(0,i + 1));
                tmp[i] = sb.toString();
            } else {
                StringBuilder sb = new StringBuilder(tmp[i].substring(1, tmp[i].length()));
                sb.append(tmp[i].charAt(0));
                sb.append("ma");
                sb.append(a.substring(0,i + 1));
                tmp[i] = sb.toString();
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            res.append(tmp[i]);
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        
        return res.toString();
    }
}