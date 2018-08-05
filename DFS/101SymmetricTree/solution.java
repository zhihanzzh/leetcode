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
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }
    
    private boolean helper (TreeNode r1, TreeNode r2) {
        if (r1 == null) {
            return r2 == null;
        }
        if (r2 == null || r1.val != r2.val) {
            return false;
        }
        
        return helper(r1.left, r2.right) && helper(r1.right, r2.left);
    }
}s