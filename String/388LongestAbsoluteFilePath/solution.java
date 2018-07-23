class Solution {
    public int lengthLongestPath(String input) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        int maxL = 0;
        
        stack.push(0);
        
        for (String s : input.split("\n")) {
            int lev = s.lastIndexOf("\t") + 1;
            while (lev + 1 < stack.size()) {
                stack.pop();
            }
            
            int curL = stack.peek() + s.length() - lev + 1;
            
            stack.push(curL);
            
            if (s.contains(".")) {
                maxL = Math.max(maxL, curL - 1);
            }
        }
        
        return maxL;
    }
}