class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < B.length; i++) {
            map.putIfAbsent(B[i], i);
        }
        
        int[] ans = new int[A.length];
        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(A[i]);
        }
        
        return ans;
    }
}