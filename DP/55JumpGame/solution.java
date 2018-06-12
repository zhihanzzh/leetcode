//DP : Time Limit Exceeded;

class Solution {
    public boolean canJump(int[] nums) {
        boolean[] res = new boolean[nums.length];
        
        res[0] = true;
        
        for (int i = 1; i < res.length; i++) {
            for (int j = 0; j < i; j++) {
                if (res[j] == true && nums[j] + j >= i) {
                    res[i] = true;
                }
            }
        }
        
        return res[res.length - 1];
    }
}