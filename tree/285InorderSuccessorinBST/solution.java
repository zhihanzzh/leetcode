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
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        
        List<TreeNode> list = new LinkedList<>();
        travels(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == p) {
                return list.get(i + 1);
            }
        }
        return null;
    }
    
    private void travels(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        
        travels(root.left, list);
        list.add(root);
        travels(root.right, list);
    }
}