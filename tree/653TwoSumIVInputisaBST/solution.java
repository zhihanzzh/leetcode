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
        return traversal(root, root, k);
    }
    private boolean traversal(TreeNode root, TreeNode node, int k){
        if (node == null) {
            System.out.println("1");
            return false;
        }
        int target = k - node.val;
        return binarySearch(root, target, k, 1) || traversal(root, node.left, k) || traversal(root, node.right, k);
    }
    private boolean binarySearch(TreeNode root, int target, int k, int count) {
        if(root == null){
            System.out.println("2");
            return false;
        }
        
        if(root.val < target){
            return binarySearch(root.right, target, k, 1);
        } else if(root.val > target) {
            return binarySearch(root.left, target, k, 1);
        } else {
            if(root.val != k - target){
                count++;
            }
            if(count > 1){
                return true;
            } else {
                return binarySearch(root.left, target, k, 2) || binarySearch(root.right, target, k, 2);
            }
        }
    }
}