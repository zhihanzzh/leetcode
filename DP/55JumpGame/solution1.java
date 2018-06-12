class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int reach = 0; i < n && i <= reach; ++i) {
            reach = Math.max(i + nums[i], reach);
        }
        return i == n;
    }
}