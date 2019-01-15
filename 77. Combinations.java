class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n <= 0 || k > n || k <= 0)
            return res;
        backtrack(res, new ArrayList<>(), n, k, 1, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> cur, int n, int k, int start, int count) {
        if(count == k) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start; i <= n; i++) {
            cur.add(i);
            backtrack(res, cur, n, k, i + 1, count + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
