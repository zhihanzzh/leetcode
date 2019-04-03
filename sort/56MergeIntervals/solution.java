/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return new LinkedList<Interval>();
        }
        
        if (intervals.size() == 1) {
            return intervals;
        }
        
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        
        
        List<Interval> res = new LinkedList<>();
        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i + 1).start <= intervals.get(i).end) {
                if (intervals.get(i + 1).end <= intervals.get(i). end) {
                    intervals.set(i + 1, intervals.get(i));
                } else {
                    intervals.set(i + 1, new Interval(intervals.get(i).start, intervals.get(i + 1).end));
                }
                
            } else {
                res.add(intervals.get(i));
            }
        }
        res.add(intervals.get(intervals.size() - 1));        
        return res;
    }
}
