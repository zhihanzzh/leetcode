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
        if (intervals.size() <= 1) {
            return intervals;
        }
        
        List<Interval> res = new ArrayList<>();

        intervals.sort((Interval o1, Interval o2) -> o1.start - o2.start);
        
        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).end >= intervals.get(i + 1).start) {
                Interval tmp = new Interval(intervals.get(i).start, Math.max(intervals.get(i).end, intervals.get(i + 1).end));
                intervals.set(i + 1,tmp);
            } else {
                res.add(intervals.get(i));
            }
        }
        res.add(intervals.get(intervals.size() - 1));
        return res;
    }
}