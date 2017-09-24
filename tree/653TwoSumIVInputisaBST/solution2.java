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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        return traversal(root, k, set);
    }
    
    private boolean traversal(TreeNode root, int k, Set<Integer> set){
        if (root == null) {
            return false;
        }
        for(Integer i : set){
            if(root.val == i){
                return true;
            }
        }
        if(!set.contains(k - root.val)){
            set.add(k - root.val);
        }
        return traversal(root.left, k, set) || traversal(root.right, k, set);
        
    }
}