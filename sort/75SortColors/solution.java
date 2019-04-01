class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int i : nums) {
            counts[i]++;
        }
        
        int red = counts[0];
        int white = counts[1];
        int blue = counts[2];
        
        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        
        for (int i = 0; i < white; i++) {
            nums[i + red] = 1;
        }
        
        for (int i = 0; i < blue; i++) {
            nums[i + red + white] = 2;
        }
    }
}
