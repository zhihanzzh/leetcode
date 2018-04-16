class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] index = new int[101];
        for(int i = 0; i < nums.length; i++) {
            index[nums[i]] = i;
        }
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] >= 2 * nums[len - 2]) {
            return index[nums[len - 1]];
        } else {
            return -1;
        }
    }
}