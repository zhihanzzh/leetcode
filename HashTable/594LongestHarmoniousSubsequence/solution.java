class Solution {
    public int findLHS(int[] nums) {
        if (nums.length == 1 ||nums.length == 0) return 0;
        Arrays.sort(nums);
        //store last number
        int pre = 0;
        int max = 0;
        //store the second number
        int high = nums[0];
        int count = 0;
        
        for(int i = 0;i < nums.length; i++){
            while(i < nums.length && nums[i] == high){
                count++;
                i++;
            }
            if(pre != 0){
                max = Math.max(max, pre + count);
            }
            if(i < nums.length && nums[i] == high + 1){
                pre = count;
                count = 1;
                if(pre != 0){
                max = Math.max(max, pre + count);
                }
                high = nums[i];
            } else if( i < nums.length && nums[i] > high + 1){
                pre = 0;
                count = 1;
                high = nums[i];
            }
        }
        return max;
    }
}