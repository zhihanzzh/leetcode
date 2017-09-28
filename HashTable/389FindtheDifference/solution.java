class Solution {
    public char findTheDifference(String s, String t) {
        int[] tmp = new int[26];
        for(int i = 0; i < s.length(); i++){
            tmp[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            tmp[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(tmp[i] == -1){
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}