class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0;
        Deque<Integer> stack = new LinkedList<>();
        int maxArea = 0;
        for(int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            if(stack.isEmpty() || heights[stack.peek()] <= h) {
                stack.push(i);
            } else {
                while(!stack.isEmpty() && heights[stack.peek()] > h) {
                    int top = stack.pop();
                    maxArea = Math.max(maxArea, heights[top] * (stack.isEmpty() ? i : i - 1 - stack.peek()));
                }
                stack.push(i);
            }
        }
        return maxArea;
    }
}
