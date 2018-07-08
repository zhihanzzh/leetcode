class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int res = quickSelect(nums, 0, nums.length - 1, k);
        return res;
    }
    
    private int quickSelect(int[] nums,int l, int r, int k) {
        if (l == r) {
            return nums[l];
        }
        
        int pivot = k;
        pivot = partition(nums, l, r, pivot);
        if (pivot == k) {
            return nums[pivot];
        } else if (pivot > k) {
            return quickSelect(nums,l, pivot - 1, k);
        } else {
            return quickSelect(nums,pivot + 1, r, k);            
        }
    }
    
    private int partition(int[] nums, int l, int r, int pivot) {
        int kValue = nums[pivot];
        swap(nums, r, pivot);
        int pIndex = l;
        for (int i = l; i < r; i++) {
            if (nums[i] < kValue) {
                swap(nums, pIndex, i);
                pIndex++;
            }
        }
        swap(nums, pIndex, r);
        return pIndex;
    }
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}