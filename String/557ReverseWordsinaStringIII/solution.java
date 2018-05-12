public class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder temp1 = new StringBuilder(temp[0]);
        StringBuilder result = new StringBuilder(temp1.reverse());
        for (int i = 1; i <temp.length; i++) {
            result.append(" ");
            temp1.delete(0, temp1.length());
            temp1.append(temp[i]);
            result.append(temp1.reverse());
        }
        return result.toString();
    }
}