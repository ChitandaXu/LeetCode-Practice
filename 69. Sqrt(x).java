class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int lo = 1, hi = x;
        while(lo <= hi) {
            int mid = (lo + hi) >> 1;
            if(x / mid == mid)
                return mid;
            if(x / mid < mid) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return hi;
    }
}
