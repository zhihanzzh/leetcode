class Solution {
    public boolean containsDuplicate(int[] nums) {     
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        
        boolean[] flag = new boolean[max - min + 1];
        for(int num : nums){
            int index = num - min;
            if(flag[index])
                return true;
            flag[index] = true;
        }
        
        return false;
    }
}