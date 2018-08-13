class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        String[]  buttons = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        backtracking(buttons, digits.toCharArray(), res, new StringBuilder(), 0);
        return res;
    }
    
    private void backtracking(String[] buttons, char[] num, List<String> res, StringBuilder tmp, int idx) {
        if (idx == num.length) {
            res.add(tmp.toString());
            return;
        }
        char[] chars = buttons[num[idx] - '2'].toCharArray();
        for (char c : chars) {
            tmp.append(c);
            backtracking(buttons, num, res, tmp, idx + 1);
            tmp.deleteCharAt(tmp.length() - 1);
        }
    }
}