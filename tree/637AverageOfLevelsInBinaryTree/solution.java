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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if(root == null) {
            return result;
        }
        
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int size = que.size();
            int divisor = que.size();
            Double sum = 0.0;
            
            while(size > 0){
                TreeNode node = que.poll();
                sum += node.val;
                if(node.left != null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
                size--;
            }
            
            result.add(sum / divisor);
        }
        
        return result;
    }
}