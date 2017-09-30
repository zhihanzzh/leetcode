class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<Integer>();
        for(int i = 0; i + p.length() <= s.length(); i++){
            if(isAnagram(s.substring(i, i + p.length()), p)){
                result.add(i);
            }
        }
        return result;
    }
    
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];
        for(char c : s.toCharArray()){
            letters[c-'a']++;
        }
        for(char c : t.toCharArray()){
            letters[c-'a']--;
        }
        for(int l : letters){
            if(l!=0) return false;
        }
        return true;
    }
}