class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    private void backtracking(List<List<Integer>> res, List<Integer> temp, int[] candidates, int remains, int start) {
        if (remains == 0) {
            res.add(new ArrayList<>(temp));
        } else if (remains < 0) {
            return;
        } else {
            for (int i = start; i <candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                temp.add(candidates[i]);
                backtracking(res, temp, candidates, remains - candidates[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}