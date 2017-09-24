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
    int count = 1;
    int max = 0;
    Integer pre = null;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){       
            result[i] = list.get(i);
        }
        return result;
    }
    
    public void helper(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        helper(root.left, list);
        if(pre != null){
            if(root.val == pre){
                count++;
            } else {
                count = 1;
            }
        }
        
        if(count > max){
            list.clear();
            list.add(root.val);
            max = count;
        } else if(count == max){
            list.add(root.val);
        }
        pre = root.val;
        helper(root.right, list);
    }
}