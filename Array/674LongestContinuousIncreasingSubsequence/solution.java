class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxL = 1;
        int curL = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int cur = nums[i];
            int next = nums[i + 1];
            if (next > cur) {
                curL++;
            } else {
                maxL = Math.max(maxL, curL);
                curL = 1;
            }
        }
        maxL = Math.max(maxL, curL);    
        return maxL;
    }
} 