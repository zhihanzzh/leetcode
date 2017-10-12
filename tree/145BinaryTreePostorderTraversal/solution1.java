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
        Stack<Integer> stack = new Stack<Integer>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null){
            if(p != null){
                stack.push(p);
                post.addFirst(p.val);
                p = p.right;
            } else {
                TreeNode node = stack.pop();
                p = node.left;
            }
        }
        
        return result;
    }
}