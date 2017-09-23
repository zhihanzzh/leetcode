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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) {
            return result;
        }
        
        String temp = "" + root.val;
        findPath(root, temp, result);
        return result;
        
    }
    private void findPath(TreeNode root, String temp, List<String> result) {
        if (root.left == null && root.right == null) {
            result.add(temp);
        }
        temp += "->";
        if (root.left != null) {
            findPath(root.left,temp + root.left.val, result);
        }
        if (root.right != null) {
            findPath(root.right,temp + root.right.val, result);
        }
    }
}