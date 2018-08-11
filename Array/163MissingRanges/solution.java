class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            if (lower == upper) {
                res.add(lower+ "");
            } else {
                res.add(lower + "->" + upper);
            }
            return res;
        }
        
        
        if (nums[0] > lower + 1) {
            res.add(lower + "->" + (nums[0] - 1));
        } else if ( nums[0] == lower + 1) {
            res.add(lower + "");
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 2) {
                res.add((nums[i - 1] + 1) + "->" + (nums[i] - 1));
            } else if (nums[i] == nums[i - 1] + 2) {
                res.add((nums[i - 1] + 1) + "");
            }
        }
        if (upper > nums[nums.length - 1] + 1) {
            res.add((nums[nums.length - 1] + 1) + "->" + upper);
        } else if (upper == nums[nums.length - 1] + 1) {
            res.add(upper + "");
        }
        
        return res;
    }
}