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
        if (root == null) {
            return true;
        }
        
        Stack<TreeNode> leftPath = new Stack<TreeNode>();
        Stack<TreeNode> rightPath = new Stack<TreeNode>();
        
        if (root.left != null) {
            leftPath.push(root.left);
        }
        if (root.right != null) {
            rightPath.push(root.right);
        }
        while (!leftPath.isEmpty() && !rightPath.isEmpty()) {
            TreeNode leftNode = leftPath.pop();
            TreeNode rightNode = rightPath.pop();
            if(leftNode.val != rightNode.val) {
                return false;
            }
            if (leftNode.left != null) {
                leftPath.push(leftNode.left);
            }
            
            if (rightNode.right != null) {
                rightPath.push(rightNode.right);
            }
            
            if (leftPath.size() != rightPath.size()) {
                return false;
            }
            
            if (leftNode.right != null) {
                leftPath.push(leftNode.right);
            }
            
            if (rightNode.left != null) {
                rightPath.push(rightNode.left);
            }
            
            if (leftPath.size() != rightPath.size()) {
                return false;
            }
            
        }

        return leftPath.size() == rightPath.size();

    }
}