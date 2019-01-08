class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if(intervals.size() == 0)
            return res;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval it1, Interval it2) {
                Integer o1 = it1.start;
                Integer o2 = it2.start;
                return o1.compareTo(o2);
            }
        });
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++) {
            if(end >= intervals.get(i).start) {
                end = Math.max(end, intervals.get(i).end);
            } else {
                res.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}
