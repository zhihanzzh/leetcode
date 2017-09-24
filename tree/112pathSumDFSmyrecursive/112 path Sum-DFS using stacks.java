class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        Stack<TreeNode> path = new Stack<TreeNode>();
        Stack<Integer> curSum = new Stack<Integer>();
        
        path.push(root);
        curSum.push(sum);
        while(!path.isEmpty()) {
            TreeNode node = path.pop();
            int temp = curSum.pop();
            if (node.left == null && node.right == null && temp == node.val) {
                return true;
            }
            
            if (node.left != null) {
                path.push(node.left);
                curSum.push(temp - node.val);
            }
            
            if (node.right != null) {
                path.push(node.right);
                curSum.push(temp - node.val);
            }
        }
        return false;
      
    }