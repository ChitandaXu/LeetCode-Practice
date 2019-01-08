class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int index = 1;
        mat[0][0] = 1;
        int x = 0, y = 0;
        while(index < n * n) {
            while(y < n - 1 && mat[x][y+1] == 0)
                mat[x][++y] = ++index;
            while(x < n - 1 && mat[x+1][y] == 0)
                mat[++x][y] = ++index;
            while(y > 0 && mat[x][y-1] == 0)
                mat[x][--y] = ++index;
            while(x > 0 && mat[x-1][y] == 0)
                mat[--x][y] = ++index;
        }
        return mat;
    }
}
