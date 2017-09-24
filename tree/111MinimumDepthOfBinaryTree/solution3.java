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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Stack<TreeNode> track = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        
        track.push(root);
        value.push(1);
        
        int minDepth = 1;
        while (!track.isEmpty()) {
            TreeNode node = track.pop();
            int curDepth = value.pop();
            if (node.left == null && node.right == null) {
                minDepth = minDepth == 1 ? curDepth : Math.min(curDepth, minDepth);
            }
            
            if (node.left != null) {
                track.push(node.left);
                value.push(curDepth + 1);
            }
            if (node.right != null) {
                track.push(node.right);
                value.push(curDepth + 1);
            }
        }
        
        return minDepth;
    }
}