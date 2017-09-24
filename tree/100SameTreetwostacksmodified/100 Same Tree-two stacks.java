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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<TreeNode>();
        Stack<TreeNode> stackQ = new Stack<TreeNode>();
        if (p != null) {
            stackP.push(p);
        }
        if (q != null) {
            stackQ.push(q);
        }
        
        while (!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode thisP = stackP.pop();
            TreeNode thisQ = stackQ.pop();
            if (thisP.val != thisQ.val) {
                return false;
            }
            if (thisP.left != null) {
                stackP.push(thisP.left);
            }
            if (thisQ.left != null) {
                stackQ.push(thisQ.left);
            }
            if(stackP.size() != stackQ.size()) {
                return false;
            }
            if (thisP.right != null) {
                stackP.push(thisP.right);
            }
            if (thisQ.right != null) {
                stackQ.push(thisQ.right);
            }
            if(stackP.size() != stackQ.size()) {
                return false;
            }
        }
        
        return stackP.size() == stackQ.size() ;
    }
}