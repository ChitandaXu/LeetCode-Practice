class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = Math.min((rows + 1) / 2, (cols + 1) / 2);
        int x = 0;
        while(x < n) {
            //left->right
            for(int j = x; j < cols - x; j++) {
                res.add(matrix[x][j]);
            }
            
            //up->down
            for(int i = x + 1; i < rows - x; i++) {
                res.add(matrix[i][cols-1-x]);
            }
            
            //right->left
            if(x * 2 < rows - 1) {
                for(int j = cols - x - 2; j >= x; j--) {
                    res.add(matrix[rows-1-x][j]);
                }
            }
            
            //down->up
            if(x * 2 < cols - 1) {
                for(int i = rows - x - 2; i >= x + 1; i--) {
                    res.add(matrix[i][x]);
                }                
            }
            x++;
        }
        return res;
    }
}
