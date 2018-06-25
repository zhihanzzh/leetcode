class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        
        for (int i = 1; i < res.length; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    res[i] = Math.max(res[i], res[j] + 1);
                }
            }
        }
        
        int max = 0;
        
        for (int i : res) {
            max = Math.max(i, max);
        }
        
        return max;
    }
}