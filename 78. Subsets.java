class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        dfs(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void dfs(List<List<Integer>> res, List<Integer> cur, int[] nums, int start) {
        res.add(new ArrayList<>(cur));
        for(int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            dfs(res, cur, nums, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
