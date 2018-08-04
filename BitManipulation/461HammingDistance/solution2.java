class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        int res = 0;
        while (binaryX.length() < binaryY.length()) {
                binaryX = "0" + binaryX;
        }
        while (binaryX.length() > binaryY.length()) {
                binaryY = "0" + binaryY;
        }
        for (int i = 0; i < binaryX.length(); i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) {
                res ++;
            }
        }
        
        return res;
        
    }
}