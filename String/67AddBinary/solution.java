class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 && j >= 0) {
            if (carry == 0) {
                int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0');
                if (sum <= 1) {
                    res.append(sum);
                    j--;
                    i--;
                } else {
                    res.append(0);
                    i--;
                    j--;
                    carry = 1;
                }
            } else {
                int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0');
                if (sum == 0) {
                    res.append(1);
                    j--;
                    i--;
                    carry = 0;
                } else if (sum == 1){
                    res.append(0);
                    i--;
                    j--;
                } else {
                    res.append(1);
                    i--;
                    j--;
                }
            }
        }
        
        while (i >= 0) {
            if (carry == 0) {
                while( i >= 0) {
                    res.append(a.charAt(i) - '0');
                    i--;
                }
            } else {
                int sum = (a.charAt(i) - '0');
                if (sum == 0) {
                    res.append(1);
                    i--;
                    carry = 0;
                } else {
                    res.append(0);
                    i--;
                }
                
            }
        }
        
         while (j >= 0) {
            if (carry == 0) {
                while( j >= 0) {
                    res.append(b.charAt(j) - '0');
                    j--;
                }
            } else {
                int sum = (b.charAt(j) - '0');
                if (sum == 0) {
                    res.append(1);
                    j--;
                    carry = 0;
                } else {
                    res.append(0);
                    j--;
                }
                
            }
        }
        
        if (carry != 0) {
            res.append(carry);
        }
        
        
        
        return res.reverse().toString();
    }
}