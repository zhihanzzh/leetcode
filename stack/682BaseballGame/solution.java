class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                int cur = stack.pop();
                sum -= cur;
            } else if (ops[i].equals("D")) {
                int cur = 2 * stack.peek();
                sum = sum + cur;
                stack.push(cur);
            } else if (ops[i].equals("+")) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                int cur = t1 + t2;
                sum += cur;
                stack.push(t2);
                stack.push(t1);
                stack.push(cur);
            } else {
                int cur = Integer.parseInt(ops[i]);
                stack.push(cur);
                sum += cur;
            }
        }
        return sum;
    }
}