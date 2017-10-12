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
        map.put(node, new UndirectedGraphNode(node.label));
        while(!que.isEmpty()){
            UndirectedGraphNode cur = que.poll();
            for(UndirectedGraphNode i : cur.neighbors){
                if(!set.contains(i)){
                    map.put(i, new UndirectedGraphNode(i.label));
                    que.offer(i);
                    set.add(i);
                }
                map.get(cur).neighbors.add(map.get(i));
            }
            
        }
        
        
        return map.get(node);
    }
}