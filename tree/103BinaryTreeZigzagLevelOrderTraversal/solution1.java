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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        travels(root, res, 0);
        
        return res;
    }
    
    private void travels(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }
        
        if (res.size() <= level) {
            res.add(new ArrayList<Integer>());
        } 
        List<Integer> ele = res.get(level);
        
        if (level % 2 == 0) {
            ele.add(root.val);
        } else {
            ele.add(0, root.val);
        }
        
        travels(root.left, res, level + 1);
        travels(root.right, res, level + 1);
    }
}