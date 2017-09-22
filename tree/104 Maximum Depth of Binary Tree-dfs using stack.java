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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Stack<TreeNode> track = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        
        track.push(root);
        value.push(1);
        
        int maxDepth = 0;
        while (!track.isEmpty()) {
            TreeNode node = track.pop();
            int curDepth = value.pop();
            maxDepth = Math.max(maxDepth, curDepth);
            
            if (node.left != null) {
                track.push(node.left);
                value.push(curDepth + 1);
            }
            if (node.right != null) {
                track.push(node.right);
                value.push(curDepth + 1);
            }
        }
        
        return maxDepth;
    }
    
}