public class Solution {
    public String reverseWords(String s) {
        String[] tmp = s.trim().split(" +");
        if (tmp.length == 0) {
            return "";
        } 
        
        int head = 0;
        int tail = tmp.length - 1;
        while (tail > head) {
            String str = tmp[head];
            tmp[head] = tmp[tail];
            tmp[tail] = str;
            tail--;
            head++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i < tmp.length; i++) {
                res.append(tmp[i]);
                res.append(" ");
        }
        res.delete(res.length() - 1, res.length());
        
        return res.toString();
    }
}