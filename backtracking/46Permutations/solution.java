class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> temp, int[] nums, int start)  {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!temp.contains(nums[i])) {
                    temp.add(nums[i]);
                    backtracking(res, temp, nums, i + 1);
                    temp.remove(temp.size() - 1);
                }

            }
        }

    }
}