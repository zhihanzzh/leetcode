class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new LinkedList<String>();
        for(int i = 0; i < words.length; i++){
            if(words[i].matches("[qwertyuiopQWERTYUIOP]*|[asdfghjklASDFGHJKL]*|[zxcvbnmZXCVBNM]*")){
                result.add(words[i]);
            }
        }
        String[] resultStr = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultStr[i] = result.get(i);
        }
        return resultStr;
    }
}