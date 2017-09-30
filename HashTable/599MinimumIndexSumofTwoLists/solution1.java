class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //use hashmap to store string and position
        Map<String, Integer> map = new HashMap<>();
        //store list 1
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i< list1.length; i++){
            map.put(list1[i],i);
        }
        for(int i = 0; i < list2.length && i <= minSum; i++){
            Integer j = map.get(list2[i]);
            if(j != null && i+j <= minSum){
                if(i+j < minSum) {
                    res.clear();
                    minSum = i + j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}