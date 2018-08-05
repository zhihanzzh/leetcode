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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        helper(root, sum);
        return flag;
    }
    
    private void helper(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            if (sum - root.val == 0) {
                
                flag = true;
            }
            
        }
        if (root.left != null) {
            helper(root.left, sum - root.val);
        }
        if (root.right != null) {
            helper(root.right, sum - root.val);
        }
    }
 }