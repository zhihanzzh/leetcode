class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        if (sum % 2 != 0) {
            return false;
        }
        
        boolean res[] = new boolean[sum / 2 + 1];
        res[0] = true;
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = sum / 2; j >= nums[i - 1]; j--) {
                res[j] = res[j] || res[j - nums[i - 1]];
            }
        }
        
        return res[res.length - 1];
    }
}