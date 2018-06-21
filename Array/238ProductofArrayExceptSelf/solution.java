class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] forwards = new int[nums.length];
        int[] backwards = new int[nums.length];
        
        int p = 1;
        
        for (int i = 0; i < nums.length; i++) {
            p *= nums[i];
            forwards[i] = p;
        }
        p = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            p *= nums[i];
            backwards[i] = p;
        }
        
        int[] res = new int[nums.length];
        res[0] = backwards[1];
        res[nums.length - 1] = forwards[nums.length - 2];
        
        for (int i = 1; i < res.length - 1; i++) {
            res[i] = forwards[i - 1] * backwards[i + 1];
        }
        
        return res;
        
    }
}