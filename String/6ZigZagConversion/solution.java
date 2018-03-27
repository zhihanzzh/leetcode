class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        
        for (int j = 0; j < s.length(); j += 2 * numRows - 2) {
            result.append(s.charAt(j));
        }
        
        for (int i = 1; i < s.length() && i < numRows - 1; i++) {
            int flag = 0;
            for (int j = i; j < s.length();) {
                result.append(s.charAt(j));
                if(flag == 0) {
                    j = j + 2 * numRows - 2 - 2 * i;
                    flag = 1;
                } else {
                    j +=  2 * i;
                    flag = 0;
                }
            }
        }
        
        for (int j = numRows - 1; j < s.length(); j += 2 * numRows - 2) {
            result.append(s.charAt(j));
        }
        
        return result.toString();
    }
}