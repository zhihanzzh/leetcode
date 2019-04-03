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



//more precise
public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() <= 1)
        return intervals;
    
    // Sort by ascending starting point using an anonymous Comparator
    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
    
    List<Interval> result = new LinkedList<Interval>();
    int start = intervals.get(0).start;
    int end = intervals.get(0).end;
    
    for (Interval interval : intervals) {
        if (interval.start <= end) // Overlapping intervals, move the end if needed
            end = Math.max(end, interval.end);
        else {                     // Disjoint intervals, add the previous one and reset bounds
            result.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }
    }
    
    // Add the last interval
    result.add(new Interval(start, end));
    return result;
}
