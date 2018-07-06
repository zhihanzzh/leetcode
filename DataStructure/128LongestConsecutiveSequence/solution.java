class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int i: nums) {
            set.add(i);
        }
        
        int max = 1;
        
        for(int i: nums) {
            if(set.remove(i)) {//num hasn't been visited
                int val = i;
                int cur = 1;
                while(set.remove(val - 1))  {
                    val--;
                    cur++;
                }
                
                val = i;
                while(set.remove(val + 1)) {
                    val++;
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max;
    }
}