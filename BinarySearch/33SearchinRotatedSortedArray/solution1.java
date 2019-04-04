class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
    
    private int helper(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        
        int mid = low + (high - low) / 2;
        
        if (nums[mid] < nums[low]) {
            if (target < nums[mid] || target > nums[high]) {
                return helper(nums, target, low, mid - 1);
            }  else if (target > nums[mid]) {
                return helper(nums, target, mid + 1, high);
            } else {
                return mid;
            }
            
        } else {
            if (target > nums[mid] || target < nums[low]) {
                return helper(nums, target, mid + 1, high);
            } else if (target < nums[mid]) {
                return helper(nums, target, low, mid - 1);
            } else {
                return mid;
            }
        }
    }
}
