class Solution {
    public int[] twoSum(int[] nums, int target) {
<<<<<<< HEAD
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }
        
//         int l = 0;
//         int r = nums.length - 1;
        
        
//         while (l < r) {
//             if (nums[l] + nums[r] == target) {
//                 res[0] = l;
//                 res[1] = r;
//                 return res;
//             } else if (nums[l] + nums[r] < target) {
//                 l++;
//             } else {
//                 r--;
//             }
//         }
        
//         return res;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            
            map.put(nums[i], i);
        }
        
        return res;
    }
}
=======
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
>>>>>>> 25254d6b892ae6da8c88af37c4d10e34fd68356f
