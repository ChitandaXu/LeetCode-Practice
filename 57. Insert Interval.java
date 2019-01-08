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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        int i = 0, j = intervals.size() - 1;
        int start = newInterval.start;
        int end = newInterval.end;
        while(i < intervals.size() && intervals.get(i).end < start)
            i++;
        if(i == intervals.size()) {
            intervals.add(newInterval);
            return intervals;
        }
        while(j >= 0 && intervals.get(j).start > end)
            j--;
        if(j == -1) {
            intervals.add(0, newInterval);
            return intervals;
        }
        for(int k = 0; k < i; k++) {
            res.add(intervals.get(k));
        }
        start = Math.min(intervals.get(i).start, start);
        end = Math.max(intervals.get(j).end, end);
        res.add(new Interval(start, end));
        for(int k = j + 1; k < intervals.size(); k++) {
            res.add(intervals.get(k));
        }
        return res;
    }
}
