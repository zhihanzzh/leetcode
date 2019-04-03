class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[]{-1, -1};
        }
        
        return helper(nums, target, 0, nums.length - 1);
    }
    
    private int[] helper(int[] nums, int target, int low, int high) {
        if (low > high) {
            return new int[]{-1, -1};
        }
        
        int mid = low + (high - low) / 2;
        if (nums[mid] < target) {
            return helper(nums, target, mid + 1, high);
        } else if (nums[mid] > target) {
            return helper(nums, target, low, mid - 1);
        } else {
            low = mid;
            high = mid;
            while(low > 0 && nums[low - 1] == target) {
                low--;
            }
            while(high < nums.length - 1 && nums[high + 1] == target) {
                high++;
            }
            return new int[]{low, high};
        }
    }
}
