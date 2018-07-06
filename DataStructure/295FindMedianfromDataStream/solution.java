class MedianFinder {
    private Queue<Long> max;
    private Queue<Long> min;
    
    /** initialize your data structure here. */
    public MedianFinder() {
        max = new PriorityQueue<>();
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        max.offer((long)num);
        min.offer(-max.poll());
        if (min.size() > max.size()) {
            max.offer(-min.poll());
        }
    }
    
    public double findMedian() {
        return max.size() > min.size() ? max.peek() : (max.peek() - min.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */