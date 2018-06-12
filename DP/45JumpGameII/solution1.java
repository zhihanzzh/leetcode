class Solution {
    public int jump(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        
        int level = 0;
        int currentMax = 0;
        int i = 0;
        int nextMax = 0;

        while (currentMax - i + 1 > 0) {		//nodes count of current level>0
         level++;
         for(; i <= currentMax; i++) {	//traverse current level , and update the max reach of next level
            nextMax = Math.max(nextMax, nums[i] + i);
            if (nextMax >= nums.length - 1) {
                return level;
            }// if last element is in level+1,  then the min jump=level 
         }
         currentMax = nextMax;
        }
        return 0;
    }
}