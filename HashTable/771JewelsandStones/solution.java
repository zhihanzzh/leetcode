class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> buckets = new HashSet<Character>();
        int sum = 0;
        
        for (int i = 0; i < J.length(); i++) {
            buckets.add(J.charAt(i));
        }
        
        for (int i = 0; i < S.length(); i++) {
            if (buckets.contains(S.charAt(i))) {
                sum++;
            }
        }
        
        return sum;
    }
}