 class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<Integer>();
        int[] hash = new int[26];
        for(char c : p.toCharArray()){
            hash[c - 'a']++;
        }
        int begin = 0;
        int end = 0;
        int count = p.length();
        while(end < s.length()){
            char c = s.charAt(end);
            
            if(hash[c -'a'] > 0){
                count--;
            }
            hash[c -'a']--;
            end++;
            
            if(count == 0){
                result.add(begin);
            }
            
            if(end - begin == p.length()){
                if(hash[s.charAt(begin) - 'a'] >= 0){
                    count++;
                }
                hash[s.charAt(begin) - 'a']++;
                begin++;
            }
        }
        return result;
    }

}