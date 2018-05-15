class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if ((n + m) % 2 == 0) {
            int t = (n + m) / 2;
            int c = 0;
            int i = 0;
            int j = 0;
            double num1 = 0;
            double num2 = 0;
            if (n == 0) {
                return (nums2[t - 1] + nums2[t]) / 2.0;
            } else if (m == 0) {
                return (nums1[t - 1] + nums1[t]) / 2.0;
            }            
            while (c <= t && i < nums1.length && j <nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    if (c == t - 1) {
                        num1 = nums1[i];
                    } else if (c == t) {
                        num2 = nums1[i];
                    }
                    i++;

                } else {
                    if (c == t - 1) {
                        num1 = nums2[j];
                    } else if (c == t) {
                        num2 = nums2[j];
                    }
                    
                    j++;
                }
                c++;
            }
            if (i == nums1.length) {
                while (c <= t) {
                    if (c == t - 1) {
                        num1 = nums2[j];
                    } else if (c == t) {
                        num2 = nums2[j];
                    }
                    j++;
                    c++;
                }
            } else  if (j == nums2.length) {
                while (c <= t) {
                    if (c == t - 1) {
                        num1 = nums1[i];
                    } else if (c == t) {
                        num2 = nums1[i];
                    }
                    i++;
                    c++;
                }   
            }
            return (num1 + num2) / 2 ;
        } else {
            int t = (n + m) / 2 + 1;
            int c = 0;
            int i = 0;
            int j = 0;
            double num = 0;
            if (n == 0) {
                return (double)nums2[t - 1];
            } else if (m == 0) {
                return (double)nums1[t - 1];
            }  
            while (c < t && i < nums1.length && j <nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    if (c == t - 1) {
                        num = nums1[i];
                    }
                    i++;
                } else {
                    if (c == t - 1) {
                        num = nums2[j];
                    } 
                    j++;
                }
                c++;
            }
            if (i == nums1.length) {
                while (c < t) {
                    if (c == t - 1) {
                        num = nums2[j];
                    }
                    j++;
                    c++;
                }
            } else  if (j == nums2.length) {
                while (c < t) {
                    if (c == t - 1) {
                        num = nums1[i];
                    }
                    i++;
                    c++;
                }  
            }
            return num;
        }
    }
}