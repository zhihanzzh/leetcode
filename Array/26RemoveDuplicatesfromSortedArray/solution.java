class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (num != nums[pos]) {
                nums[++pos] = num;
            }
        }
        
        return pos + 1;
    }
}