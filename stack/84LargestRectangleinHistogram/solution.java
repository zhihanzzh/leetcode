class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while (i < heights.length) {
            if (stack.empty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int index = stack.pop();
                max = Math.max(max, heights[index] * (i - (stack.empty()? -1 : stack.peek()) - 1));
            }
        }
        
        while (!stack.empty()) {
            int index = stack.pop();
            max = Math.max(max, heights[index] * (i - (stack.empty()? -1 : stack.peek()) - 1));
        }
        return max;
    }
}