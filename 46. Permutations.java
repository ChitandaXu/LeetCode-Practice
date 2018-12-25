class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        List<Integer> cur = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            cur.add(nums[i]);
        }
        backtrack(res, cur, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int index) {
        if(index == cur.size() - 1) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = index; i < cur.size(); i++) {
            int temp = cur.get(i);
            cur.set(i, cur.get(index));
            cur.set(index, temp);
            backtrack(res, cur, index + 1);
            temp = cur.get(i);
            cur.set(i, cur.get(index));
            cur.set(index, temp);
        }
    }
}
