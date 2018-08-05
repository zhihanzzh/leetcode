class Solution {
    public int reverse(int x) {
        while (x != 0 && x % 10 == 0) {
            x /= 10;
        }
        
        int rev = 0;
        while (x != 0) {
            int tmp = rev * 10 + x % 10;
            if (tmp / 10 != rev) {
                return 0;
            }
            rev = tmp;
            x /= 10;
        }
        
        return rev;
    }
}