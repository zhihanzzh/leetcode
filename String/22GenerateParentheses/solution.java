class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        
        generator(res, "", 0, 0, n);
        
        return res;
    }
    
    private void generator(List<String> res, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            res.add(str);
            return;
        }
        
        if (open < max) {
            generator(res, str + "(", open + 1, close, max);
        }
        if (close < open) {
            generator(res, str + ")", open, close + 1, max);
        }
    }
}