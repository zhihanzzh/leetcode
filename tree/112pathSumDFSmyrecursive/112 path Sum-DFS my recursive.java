/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        calculatePath(root, sum, root.val);
        return result;
    }
    
    private void calculatePath(TreeNode root, int sum, int current) {
        if (root.left == null && root.right == null && current == sum) {
            result = true;
        }
        if (root.left != null) {
            calculatePath(root.left, sum, current + root.left.val);
        }
        if (root.right != null) {
            calculatePath(root.right, sum, current + root.right.val);
        }
    }
}