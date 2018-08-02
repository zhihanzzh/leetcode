class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        int m1 = nums[0];
        int m2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        
        for (int i : nums) {
            if (i == m1) {
                count1++;
            } else if (i == m2) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                m1 = i;
            } else if (count2 == 0) {
                count2++;
                m2 = i;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for (int i : nums) {
            if (i == m1) {
                count1++;
            } else if (i == m2) {
                count2++;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        
        if (count1 > nums.length / 3) {
            res.add(m1);
        }
        if (count2 > nums.length / 3) {
            res.add(m2);
        }
        
        return res;
    }
}