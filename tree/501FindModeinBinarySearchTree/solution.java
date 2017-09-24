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
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int[] findMode(TreeNode root) {
        helper(root);
        int max = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        
        for(Integer key : map.keySet()){       
            Integer value = map.get(key);
            if(value == max){
                que.offer(key);
            } else if(value > max){
                max = value;
                while(!que.isEmpty()){
                    que.poll();
                }
                que.offer(key);
            }
        }
        
        int[] result = new int[que.size()];
        
        for(int i = 0; i < result.length; i++){
            result[i] = que.poll();
        }
        
        return result;
    }
    
    private void helper(TreeNode root) {
        if(root == null){
            return;
        }
        
        if(map.containsKey(root.val)){
            map.put(root.val, map.get(root.val) + 1);
        } else {
            map.put(root.val, 1);
        }
        
        helper(root.left);
        helper(root.right);
    }
}