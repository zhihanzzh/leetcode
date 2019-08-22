class Solution {
    public String defangIPaddr(String address) {
        char[] c = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '.') {
                sb.append('[');
                sb.append(c[i]);
                sb.append(']');
            } else {
                sb.append(c[i]);
            }
        }
        
        return sb.toString();
    }
}
