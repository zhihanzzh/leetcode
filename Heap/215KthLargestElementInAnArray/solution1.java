class Solution {
    public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        
//         for (int i : nums) {
//             pq.offer(i);
//         }
        
//         while (k > 1) {
//             pq.poll();
//             k--;
//         }
        
//         return pq.poll();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i : nums) {
            pq.offer(i);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        return pq.peek();
    }
}
