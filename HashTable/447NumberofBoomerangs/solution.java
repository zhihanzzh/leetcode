class Solution {
    int res = 0;
    
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if (i != j){
                    int dis = getDistance(points[i], points[j]);
                    map.put(dis, map.getOrDefault(dis, 0) + 1);
                }
            }
            
            for(int val : map.values()){
                res += val * (val - 1);
            }
            map.clear();
        }
        
        return res;
    }
    
    private int getDistance(int[] a, int[] b){
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}