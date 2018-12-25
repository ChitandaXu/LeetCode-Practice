class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0)
            return true;
        int cur = 0;
        int i = 0;
        while(cur < nums.length - 1) {
            int pre = cur;
            for(; i <= pre; i++) {
                cur = Math.max(cur, i + nums[i]);
            } 
            if(cur <= pre)
                return false;
        }
        return true;
    }
}
