class Solution {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0 , nums.length - 1);
    }
    
    private int helper(int[] nums, int low, int high) {
        if (low == high) {
            return low;
        }
        
        int mid = (high - low) / 2 + low;
        if (nums[mid] > nums[mid + 1]) {
            return helper(nums, low, mid);
        } else {
            return helper(nums, mid + 1, high);
        }
    }
}
