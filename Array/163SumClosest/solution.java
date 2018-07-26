class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int hi = nums.length - 1;
                int lo = i + 1;
                while ( lo < hi) {
                    if (nums[lo] + nums[hi] + nums[i] == target) {
                        return target;
                    } else if (nums[lo] + nums[hi] + nums[i] < target) {
                        if ( target - (nums[lo] + nums[hi] + nums[i]) < gap) {
                            gap = target - (nums[lo] + nums[hi] + nums[i]);
                            res = nums[lo] + nums[hi] + nums[i];
                        }
                        lo++;
                    } else {
                        if ((nums[lo] + nums[hi] + nums[i]) - target < gap) {
                            gap = (nums[lo] + nums[hi] + nums[i]) - target;
                            res = nums[lo] + nums[hi] + nums[i];
                        }
                        hi--;
                    }
                }
                
            }
            
        }
        return res;
                
            
        
    }
}