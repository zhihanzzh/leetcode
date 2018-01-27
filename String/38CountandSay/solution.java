class Solution {
    public String countAndSay(int n) {
        String pattern = "1";
        int nums =  1;
        char cur = '1';
        for (int i = 1; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            cur = pattern.charAt(0);
            for (int j = 1; j < pattern.length(); j++) {
                if (pattern.charAt(j) == cur) {
                    nums++;
                } else {
                    tmp.append(nums);
                    tmp.append(cur);
                    cur = pattern.charAt(j);
                    nums = 1;
                }
            }
            tmp.append(nums);
            tmp.append(cur);
            pattern = tmp.toString();
            nums =  1;
        }
        
        return pattern;
    }
}