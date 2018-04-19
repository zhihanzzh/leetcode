class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int p = left;
        List<Integer> ans= new ArrayList<Integer>();
        
        while (p <= right) {
            int m = p;
            boolean flag = true;
            
            while (m > 0) {
                int d = m % 10;
                if (d == 0 || p % d != 0) {
                    flag = false;
                    break;
                }
                m = m / 10;
            }
            
            if (flag) {
                ans.add(p);
            }
            
            p++;    
        }
        
        return ans;
    }
}