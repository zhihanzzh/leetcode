class Solution {
    // a ^ a = 0 0 ^ a = a 0 ^ 0 = 0
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i < nums.length; i++){
            ans ^= nums[i];
        }
            
        return ans;
    }
}