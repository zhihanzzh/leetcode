class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int i = 0;
        
        int count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1) {
                    count++;
                    break;
                } 
                if (flowerbed[i + 1] == 0) {
                    count++;
                } else {
                    i++;
                }
            }
            i += 2;
        }
        
        return count >= n;
    }
}
