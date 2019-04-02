class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.add(entry);
        }
        
        
        List<Integer> res = new LinkedList<>();
        while (k > 0) {
            res.add(pq.poll().getKey());
            k--;
        }
        
        return res;
    }
}
