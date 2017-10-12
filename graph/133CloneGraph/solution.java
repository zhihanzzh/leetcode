/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null){
            return null;
        }
        
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        Set<UndirectedGraphNode> set = new HashSet<UndirectedGraphNode>();
        Queue<UndirectedGraphNode> que = new LinkedList<UndirectedGraphNode>();
        
        que.offer(node);
        set.add(node);
        while(!que.isEmpty()){
            UndirectedGraphNode cur = que.poll();
            for(UndirectedGraphNode i : cur.neighbors){
                if(!set.contains(i)){
                    que.offer(i);
                    set.add(i);
                }
            }
            map.put(cur, new UndirectedGraphNode(cur.label));
        }
        set.clear();
        
        que.offer(node);
        set.add(node);
         while(!que.isEmpty()){
            UndirectedGraphNode cur = que.poll();
            for(UndirectedGraphNode i : cur.neighbors){
                map.get(cur).neighbors.add(map.get(i));
                if(!set.contains(i)){
                    que.offer(i);
                    set.add(i);
                }
            }
        }
        
        return map.get(node);
    }
}