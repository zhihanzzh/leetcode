class Solution {
    public void moveZeroes(int[] nums) {
        int gap = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                gap++;
            } else if (gap != 0) {
                nums[i - gap] = nums[i];
                nums[i] = 0;
            }
        }
    }
}