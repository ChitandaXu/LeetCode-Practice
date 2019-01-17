class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(target == nums[mid])
                return true;
            if(nums[mid] == nums[lo] && nums[lo] == nums[hi])
                return search(nums, lo, hi, target);
            if(nums[mid] >= nums[lo]) {
                if(target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if(target > nums[mid] && target < nums[lo]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
    
    private boolean search(int[] nums, int lo, int hi, int target) {
        for(int i = lo; i <= hi; i++) {
            if(target == nums[i])
                return true;
        }
        return false;
    }
}
