class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int maxL = 0;
        int minR = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            int t1 = len1;
            len1 = len2;
            len2 = t1;
            int[] t2 = nums1;
            nums1 = nums2;
            nums2 = t2;
        }
        
        int low = 0;
        int high = len1;
        int halfLen = (len1 + len2 + 1) / 2;
        while (low <= high) {
            int i = (low + high) / 2;
            int j = halfLen - i;
            
            if (i > 0 && nums1[i - 1] > nums2[j]) {
                high = i - 1;
            } else if (i < len1 && nums1[i] < nums2[j - 1]) {
                low = i + 1;
            } else {

                if (i == 0) {
                    maxL = nums2[j - 1];
                } else if (j == 0) {
                    maxL = nums1[i - 1];
                } else {
                    maxL = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                
                if ((len1 + len2) % 2 != 0) {
                    return maxL;
                } else {
                    if (i == len1) {
                    minR = nums2[j];
                    } else if (j == len2) {
                    minR = nums1[i];
                    } else {
                    minR = Math.min(nums1[i], nums2[j]);
                    }
                }
                return (minR + maxL) / 2.0;

            }
        }
        return 0;
    }
}