//DP : Time limit exceeded

class Solution {
    public int jump(int[] nums) {
        int[] res = new int[nums.length];
        boolean[] state = new boolean[nums.length];
        res[0] = 0;
        state[0] = true;
        for (int i = 1; i < res.length; i++) {
            res[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (state[j] && nums[j] + j >= i) {
                    state[i] = true;
                    res[i] = Math.min(res[j] + 1, res[i]);
                }
            }
        }
        
        return res[res.length - 1];
    }
}