class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null || str==null) return false;
        if(str.length()==0 && pattern.length()==0) return true;
        if(str.length()==0 || pattern.length()==0) return false;
        String arr[] = str.split(" ");
        Set<String> used = new HashSet<>();
        if(arr.length != pattern.length()) return false;
        String[] map = new String[26];
        for(int i=0; i<arr.length; i++){
            int index = pattern.charAt(i)-'a';
            if(map[index] != null){
                if(!map[index].equals(arr[i])) return false;
            }
            else{
                if(used.contains(arr[i])) return false;
                map[index] = arr[i];
                used.add(arr[i]);
            }
        }
        return true;
    }
}