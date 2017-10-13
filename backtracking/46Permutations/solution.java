class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tmpRes = new ArrayList<Integer>();
        getPermute(nums, result, tmpRes);
        return result;
    }
    
    private void getPermute(int[] nums, List<List<Integer>> result, List<Integer> tmpRes) {
        if(tmpRes.size() == nums.length){
            result.add(new ArrayList(tmpRes));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!tmpRes.contains(nums[i])){
                tmpRes.add(nums[i]);
                getPermute(nums, result, tmpRes);
                tmpRes.remove(tmpRes.size() - 1);
            }
        }
    }
}