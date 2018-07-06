class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int i: nums) {
            set.add(i);
        }
        
        int max = 0;
        
        for(int i: nums) {
                int count = i;
                while(set.contains(count)){
                    count++;
                }
                max = Math.max(count - i, max);
        }
        return max;
    }
}