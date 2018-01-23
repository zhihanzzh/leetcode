class Solution {
    public String reverseString(String s) {
        StringBuffer temp = new StringBuffer();
        for(int i = s.length() - 1; i >= 0; i--) {
            temp.append(s.charAt(i));
        }
        return temp.toString();
    }
}