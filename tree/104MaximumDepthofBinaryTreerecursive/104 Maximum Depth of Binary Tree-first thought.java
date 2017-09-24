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
    private int curDepth = 0;
    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        findDepth(root);
        
        return maxDepth;
    }
    
    private void findDepth(TreeNode root) {
        curDepth++;
        maxDepth = Math.max(curDepth, maxDepth);
        if (root.left != null) {
            findDepth(root.left);
        }
        if (root.right != null) {
            findDepth(root.right);
        }
        curDepth--;
    }
}