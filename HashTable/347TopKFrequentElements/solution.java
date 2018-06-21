class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> fMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            fMap.put(nums[i], fMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int key : fMap.keySet()) {
            int f = fMap.get(key);
            if (bucket[f] == null) {
                bucket[f] = new ArrayList<Integer>();
            }
            bucket[f].add(key);
        }
        
        List<Integer> res = new LinkedList<Integer>();
        
        for (int i = bucket.length - 1; i > 0 && k > 0; i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
                
                k -= bucket[i].size();
            }
            
        }
        
        return res;
    }
    
}