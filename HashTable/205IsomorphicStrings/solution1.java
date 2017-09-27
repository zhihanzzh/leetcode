class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            // 'if' needed to be put before storing the last position
            if(a[s.charAt(i)] != b[t.charAt(i)]){
                return false;
            }
            a[s.charAt(i)] = i + 1;
            b[t.charAt(i)] = i + 1;
            
        }
        return true;
    }
}