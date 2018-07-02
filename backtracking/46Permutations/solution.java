class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), nums);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> temp, int[] nums)  {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!temp.contains(nums[i])) {
                    temp.add(nums[i]);
                    backtracking(res, temp, nums);
                    temp.remove(temp.size() - 1);
                }

            }
        }

    }
}