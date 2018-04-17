class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] pattern = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<String>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < s.length(); i++) {
                sb.append(pattern[s.charAt(i) - 'a']);
            }
            
            set.add(sb.toString());
        }
        
        return set.size();

    }
}