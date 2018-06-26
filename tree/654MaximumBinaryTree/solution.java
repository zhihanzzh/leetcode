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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return null;
        }
        
        return getTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode getTree(int[] nums, int l, int r) {
        if (l > r || l >= nums.length || r < 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                index = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = getTree(nums, l, index - 1);
        root.right = getTree(nums, index + 1, r);
        
        return root;
    }
}