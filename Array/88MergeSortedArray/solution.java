class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1; i >= 0; i--) {
            nums1[i + n] = nums1[i];
        }
        
        int i = n;
        int j = 0;
        int k = 0;
        while (j < n && i < m + n) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums1[i];
                k++;
                i++;
            } else {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        if (j < n) {
            while (j < n) {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
        
    }
}