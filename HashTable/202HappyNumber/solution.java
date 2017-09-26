class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        while(n != 1){
            int sum = 0;
            while(n > 0){
                int m = n % 10;
                sum += m * m;
                n /= 10;
            }
            n = sum;
            if(set.contains(n)){
                return false;
            } else {
                set.add(n);
            }
        }
        
        return n == 1;
    }
}