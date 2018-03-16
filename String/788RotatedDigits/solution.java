class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if (isGood(i, false)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isGood(int n, boolean flag) {
        if (n == 0) {
            return flag;
        }
        int d = n % 10;
        if (d == 3 || d == 4 || d == 7) {
            return false;
        }
        
        if (d == 2 || d == 5 || d == 6 || d == 9) {
            return isGood(n / 10, true);
        }
        
        return isGood(n / 10, flag);
    }
}