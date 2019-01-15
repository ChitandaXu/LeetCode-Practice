class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int index0 = 0, index1 = 0, index2 = nums.length - 1;
        while(index1 <= index2) {
            if(nums[index1] == 0) {
                swap(nums, index0, index1);
                index0++;
                index1++;
            } else if(nums[index1] == 1) {
                index1++;
            } else if(nums[index1] == 2) {
                swap(nums, index1, index2);
                index2--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
