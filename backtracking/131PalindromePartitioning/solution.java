class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), s, 0);
        return res;        
    }
    
    private void backtracking(List<List<String>> res, List<String> temp, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<String>(temp));
        } else {
            for(int i = start; i < s.length(); i++){
             if(isPalindrome(s, start, i)){
                temp.add(s.substring(start, i + 1));
                backtracking(res, temp, s, i + 1);
                temp.remove(temp.size() - 1);
             }
            }
        }
    }
    
    public boolean isPalindrome(String str, int l, int r){
        if(l==r) return true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }    
}