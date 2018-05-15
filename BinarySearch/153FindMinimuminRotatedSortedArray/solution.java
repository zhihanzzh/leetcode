class Solution {
    public int findMin(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        
        while (low < high) {
            int m = (high - low) / 2 + low;
            if (m > 0 && nums[m] < nums[m - 1]) {
                return nums[m];
            }
            
            if (nums[m] >= nums[low] && nums[m] > nums[high]) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        
        return nums[low];
    }
}