class Solution {
    public int longestPalindrome(String s) {
        int sum = 0;
        int[] hash = new int[128];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i)]++;
        }
        int odd = 0;
        for(int i = 0; i < hash.length; i++){
            if(hash[i] > 0){
                if(hash[i] % 2 == 0){
                    sum += hash[i];
                } else {
                    odd = 1;
                    sum += hash[i] - 1;
                }
            }
        }
        if (odd > 0){
            sum++;
        }
        return sum;
    }
}