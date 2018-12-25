class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] rows = new int[n];
        backtrack(res, rows, n, 0);
        return res;
    }
    
    private void backtrack(List<List<String>> res, int[] rows, int n, int i) {
        if(i == n) {
            res.add(getCur(rows, n));
            return;
        }
        for(int j = 0; j < n; j++) {
            if(isValid(i, j, rows)) {
                rows[i] = j;
                backtrack(res, rows, n, i + 1);
            }
        }
    }
    
    private List<String> getCur(int[] rows, int n) {
        List<String> cur = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < rows[i]; j++) {
                sb.append(".");
            }
            sb.append("Q");
            for(int j = rows[i] + 1; j < n; j++) {
                sb.append(".");
            }
            cur.add(sb.toString());
        }
        return cur;
    }
    
    private boolean isValid(int i, int j, int[] rows) {
        for(int k = 0; k < i; k++) {
            if(rows[k] == j || Math.abs(rows[k] - j) == Math.abs(k - i))
                return false;
        }
        return true;
    }
}
