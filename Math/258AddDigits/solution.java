class Solution {
    public int addDigits(int num) {
        int res = num;
        while ( num >= 10) {
            res = 0;
            while (num > 0) {
                res += num % 10;
                num /= 10;
            }
            
            num = res;
        }
        
        return res;
    }
}