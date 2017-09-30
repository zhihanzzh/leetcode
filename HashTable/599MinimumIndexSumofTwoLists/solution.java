class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
        List<String> list = new LinkedList<String>();
        
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                if(map.get(list2[i]) + i < min){
                    list.clear();
                    min = map.get(list2[i]) + i;
                    list.add(list2[i]);
                } else if(map.get(list2[i]) + i == min){
                    list.add(list2[i]);
                }
            }
        }
        
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}