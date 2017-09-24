class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else{
                map.put(nums[i], 2);
            }
        }
        
        for(Integer key : map.keySet()){
            Integer value = map.get(key);
            if(value == 1){
                return key;
            }
        }
        
        return -1;
    }
}