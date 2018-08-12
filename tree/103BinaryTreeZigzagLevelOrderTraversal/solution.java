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
        Queue<TreeNode> q = new LinkedList<>();
        boolean order = true;
        q.offer(root);
        int size = 1;
        while (!q.isEmpty()) {
            List<Integer> levelE = new ArrayList<Integer>();
            while (size > 0) {
                TreeNode cur = q.poll();
                if (order) {
                    levelE.add(cur.val);
                } else {
                    levelE.add(0, cur.val);
                }
                
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
                size--;
            }
            order = order ? false : true;
            size = q.size();
            res.add(levelE);
        }
        
        return res;
    }
}