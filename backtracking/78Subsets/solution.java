class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> element = new ArrayList<Integer>();
        backtracking(res, element, nums, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> element, int[] nums, int start) {
        res.add(new ArrayList<>(element));
        
        for (int i = start; i < nums.length; i++) {
            element.add(nums[i]);
            backtracking(res, element, nums, i + 1);
            element.remove(element.size() - 1);
        }
    }
}