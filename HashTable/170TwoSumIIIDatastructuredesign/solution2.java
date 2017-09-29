class TwoSum {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private int min, max;
    /** Initialize your data structure here. */
    public TwoSum() {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        map = new HashMap<Integer, Integer>();
        list = new LinkedList<Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(min > number) min = number;
        if(max < number) max = number;
        
        if(map.containsKey(number))
            map.put(number, map.get(number) + 1);
        else{
            map.put(number, 1);
            list.add(number);
        }
    }