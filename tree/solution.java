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
    int min1;
    long ans = Long.MAX_VALUE;
    
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        helper(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
    private void helper(TreeNode root) {
        if(root != null){
            if(min1 < root.val && root.val < ans){
                ans = root.val;
            } else if(min1 == root.val){
                helper(root.left);
                helper(root.right);
            }
        }
    }
}