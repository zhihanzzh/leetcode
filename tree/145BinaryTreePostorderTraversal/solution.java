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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post= new ArrayList<Integer>();
        helper(root, post);
        return post;
    }
    private void helper(TreeNode root, List<Integer> post){
        if(root == null){
            return;
        }
        helper(root.left, post);
        helper(root.right, post);
        post.add(root.val);
    }
}