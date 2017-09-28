class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<String, Character> map = new HashMap<String, Character>();
        HashSet<Character> set = new HashSet<Character>();
        
        String[] split = str.split(" ");
        
        if(pattern == null && str == null){
            return true;
        }
        if(pattern.length() != split.length){
            return false;
        } 
        
        for(int i = 0; i < split.length; i++) {
            if(map.containsKey(split[i])){
                if(map.get(split[i]) != pattern.charAt(i)){
                    return false;
                }
            } else {
                if(set.contains(pattern.charAt(i))){
                    return false;
                }
                map.put(split[i], pattern.charAt(i));
                set.add(pattern.charAt(i));
            }
        }
        return true;
    }
}