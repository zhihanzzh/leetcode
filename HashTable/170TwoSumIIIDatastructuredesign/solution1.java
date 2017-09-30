class TwoSum {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    
    /** Initialize your data structure here. */
    public TwoSum() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(map.containsKey(number)){
            map.put(number, map.get(number) + 1);
        } else {
            list.add(number);
            map.put(number, 1);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            int j = value - num;
            if((num == j && map.get(num) > 1) ||  (num != j && map.containsKey(j))){
                return true;
            } 
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */