class Solution {
    public int totalNQueens(int n) {
        if(n <= 1)
            return n;
        int[] rows = new int[n];
        return backtrack(n, rows, 0);
    }
    
    private int backtrack(int n, int[] rows, int i) {
        if(i == n)
            return 1;
        int res = 0;
        for(int j = 0; j < n; j++) {
            if(isValid(rows, i, j)) {
                rows[i] = j;
                res += backtrack(n, rows, i + 1);
            }
        }
        return res;
    }
    
    private boolean isValid(int[] rows, int i, int j) {
        for(int k = 0; k < i; k++) {
            if(rows[k] == j || Math.abs(rows[k] - j) == Math.abs(k - i))
                return false;
        }
        return true;
    }
}
