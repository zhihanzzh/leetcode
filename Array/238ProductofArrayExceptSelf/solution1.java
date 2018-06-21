//constant space
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        
        int p = 1;
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            p *= nums[i - 1];
            res[i] = p;
        }
        p = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            p *= nums[i + 1];
            res[i] *= p;
        }
        
        return res;
        
    }
}