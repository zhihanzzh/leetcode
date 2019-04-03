class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();
        if (intervals.size() == 0 || intervals == null) return list;
        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start != i2.start) {
                    return i1.start - i2.start;
                }
                return i1.end - i2.end;
            }
        });
        
        Stack<Interval> stack = new Stack<>();
        for (Interval interval : intervals) {
            if (!stack.isEmpty()) {
                if (stack.peek().end >= interval.start) {
                    if (stack.peek().end < interval.end) {
                        Interval popped = stack.pop();
                        popped.end = interval.end;
                        stack.push(popped);
                    }
                } else {
                    stack.push(interval);
                }
            } else {
                stack.push(interval);
            }
        }
        
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        
        return list;
    }
}
