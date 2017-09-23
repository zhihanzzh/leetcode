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
        
        Queue<TreeNode> track = new LinkedList<TreeNode>();
        track.offer(root);
        int min = 1;
        while (!track.isEmpty()) {
            int size = track.size();
            while (size-- > 0) {
                TreeNode node = track.poll();
                if (node.left == null && node.right == null) {
                    return min;
                }
                if (node.left != null) {
                    track.offer(node.left);
                }
                if (node.right != null) {
                    track.offer(node.right);
                }
            }
            min++;
        }
        
        return -1;
    }
}