class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 1;
        int cur = nums[0];
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != cur) {
                nums[index++] = nums[i];
                cur = nums[i];
                count = 1;
            } else {
                count++;
                if(count <= 2)
                    nums[index++] = nums[i];
            }
        }
        return index;
    }
}
