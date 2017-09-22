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
        stackP.push(p);
        stackQ.push(q);
        while (!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode thisP = stackP.pop();
            TreeNode thisQ = stackQ.pop();
            if (thisP == null && thisQ == null) {
                continue;
            }
            if (thisP == null || thisQ == null) {
                return false;
            }
            if (thisP.val != thisQ.val) {
                return false;
            }
            stackP.push(thisP.left);
            stackQ.push(thisQ.left);
            stackP.push(thisP.right);
            stackQ.push(thisQ.right);
        }
        
        return stackP.size() == stackQ.size() ;
    }
}