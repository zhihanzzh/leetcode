class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        String[]  buttons = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char[] ch = digits.toCharArray();
        StringBuilder str = new StringBuilder();
        List<String> res = new ArrayList<>();
        res.add("");
        for (char digit : ch) {
            char[] s = buttons[digit - '2'].toCharArray();
            int size = res.size();
            while (size > 0) {
                for (char c : s) {
                    res.add(res.get(0) + c);
                    
                    
                }
                res.remove(0);
                size--;
            }
        }
        
        return res;
    }
}