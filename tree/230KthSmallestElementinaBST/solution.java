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
    public int kthSmallest(TreeNode root, int k) {
        int leftN = count(root.left);
        
        if (leftN >= k) {
            return kthSmallest(root.left, k);
        } else if ( k > (leftN + 1)) {
            return kthSmallest(root.right, k - leftN - 1);
        }
        
        return root.val;
    }
    
    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return 1 + count(root.left) + count(root.right);
    }
}