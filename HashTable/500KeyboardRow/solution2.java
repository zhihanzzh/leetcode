class Solution {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        List<String> res = new LinkedList<>();
        outer: for(String w: words){
            if(w.equals("")){
                continue;
            }
            int index = map.get(w.charAt(0));
            for(char c: w.toUpperCase().toCharArray()){
                if(map.get(c)!=index){
                    continue outer;
                }
            }
            res.add(w);//if index != -1, this is a valid string
        }
        return res.toArray(new String[0]);
    }
}