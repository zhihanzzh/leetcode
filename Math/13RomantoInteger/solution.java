class Solution {
    public int romanToInt(String s) {
        int res = 0;
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            switch (c[i]) {
                case 'I' :
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V' :
                    res += 5;
                    break;
                case 'X' :
                    res += (res >= 50 ? -10 : 10);
                    break;
                case 'L' :
                    res += 50;
                    break;
                case 'C' :
                    res += (res >= 500 ? -100 : 100);
                    break;
                case 'D' :
                    res += 500;
                    break;
                case 'M' :
                    res += 1000;
                    break;
            }
        }
        
        return res;
    }
}