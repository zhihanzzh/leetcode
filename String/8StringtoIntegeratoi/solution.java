class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int sign = 1;
        char[] sc = str.toCharArray();
        if (sc.length == 0) {
            return 0;
        }
        int i = 0;
        if (sc[i] == '+' || sc[i] == '-') {
            sign = sc[i] == '+' ? 1 : -1;
            i++;
        } else if (sc[0] < '0' || sc[0] > '9') {
            return 0;
        }
        StringBuilder res = new StringBuilder();
        while (i < sc.length) {
            if (sc[i] >= '0' && sc[i] <= '9') {
                res.append(sc[i]);
                i++;
            } else {
                break;
            }
        }

        if (res.length() == 0) {
            return 0;
        }
        
        if (res.length() > 10) {
            return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } 
        if (res.length() == 10) {
            if (sign > 0) {
                if (Character.getNumericValue(res.charAt(0)) >  Integer.MAX_VALUE / 1000000000) {
                   return Integer.MAX_VALUE;
               }
                for (int j = 1; j < 10; j++) {
               if (Character.getNumericValue(res.charAt(j)) > (Integer.MAX_VALUE % ((int)Math.pow(10,10 - j))) / (int)Math.pow(10,9 - j)) {
                   return Integer.MAX_VALUE;
               }
              }
            } else {
                for (int j = 0; j < 10; j++) {
               if (Character.getNumericValue(res.charAt(j)) > -1 * (j == 0 ? Integer.MIN_VALUE / 1000000000 : (Integer.MIN_VALUE % ((int)Math.pow(10,10 - j))) / (int)Math.pow(10,9 - j) )) {
                   System.out.println("22");
                   return Integer.MIN_VALUE;
               }
              }
            }
            
            
        }
        return sign * Integer.parseInt(res.toString());
    }
}