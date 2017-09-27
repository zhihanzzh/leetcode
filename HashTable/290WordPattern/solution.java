290. Word class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        
        String[] strTmp = str.split(" ");
        
        if(strTmp.length != pattern.length()){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c).equals(strTmp[i])){
                    continue;
                } else {
                    return false;
                }
            } else{
                if(!map.containsValue(strTmp[i])){
                    map.put(c, strTmp[i]);
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}