class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int cur = 0;
        int i = 0;
        while(cur < nums.length - 1) {
            int pre = cur;
            for(; i <= pre; i++) {
                cur = Math.max(cur, i + nums[i]);
            }
            if(cur <= pre)
                return -1;
            step++;
        }
        return step;
    }
}
