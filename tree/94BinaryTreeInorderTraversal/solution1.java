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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()){
            while(p != null){
                stack.push(p);
                p = p.left;
            }
            
            p = stack.pop();
            result.add(p.val);
            p = p.right;
        }
        
        return result;
    }
}