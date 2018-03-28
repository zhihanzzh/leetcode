class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if (digits.isEmpty() || digits.contains("1") || digits.contains("0")) {
            return res;
        }
        String[] p = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        res.add("");
        
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            while (res.peek().length() == i) {
                String tmp = res.remove();
                for (char c : p[num].toCharArray()) {
                    res.add(tmp + c);
                }
            }
        }
        
        return res;
    }
}