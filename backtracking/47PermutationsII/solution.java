class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);       
        backtracking(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                temp.add(nums[i]);
                backtracking(res, temp, nums, used);
                used[i] = false;
                temp.remove(temp.size() - 1);                
            }
            
        }
    }
}