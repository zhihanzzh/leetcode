class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        
        s = s.replaceAll("[\\W]", "").toLowerCase();
        
        int head = 0;
        int tail = s.length() - 1;
        while(head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}