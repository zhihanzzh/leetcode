class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int n = nums.length;
        long sum = n * (n + 1) / 2;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i : nums){
            if(set.contains(i)){
                dup = i;
            }
            set.add(i);
            sum -= i;
        }
        
        return new int[] {dup, (int)sum + dup};
    }
}