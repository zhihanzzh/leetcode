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
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        getPaths(root, "", res);
        return res;
    }
    
    private void getPaths(TreeNode root, String s, List<String> res) {
        s += String.valueOf(root.val);
        s += "->";
        if (root.left == null && root.right == null) {
            res.add(s.substring(0, s.length() - 2));
            return;
        }
        if (root.left != null) {
            getPaths(root.left, s, res);
        }
        if (root.right != null) {
            getPaths(root.right, s, res);
        }
        
    }
}