class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();

        
        for(int i = 0; i < nums1.length; i++){
                set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            } 
        }
        int i = 0;
        int[] resultArr = new int[result.size()];
        for( int k : result){
            resultArr[i++] = k;
        }
        
        return resultArr;
    }
}