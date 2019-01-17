class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int[] heights = new int[n+1];
        int maxArea = 0;
        for(int i = 0; i < m; i++) {
            Deque<Integer> stack = new LinkedList<>();
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }
            for(int j = 0; j <= n; j++) {
                if(stack.isEmpty() || heights[j] >= heights[stack.peek()]) {
                    stack.push(j);
                } else {
                    while(!stack.isEmpty() && heights[j] < heights[stack.peek()]) {
                        int top = stack.pop();
                        maxArea = Math.max(maxArea, heights[top] * (stack.isEmpty() ? j : j - stack.peek() - 1));
                    }
                    stack.push(j);
                }
            }
        }
        return maxArea;
    }
}
