//the usage of distMin & distMax
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size() - 1);       
        int min = arrays.get(0).get(0); 
        int maxIndex = 0, minIndex = 0;
        
        //Find min & max values
        for(int i = 1; i < arrays.size(); i++){
            
            List<Integer> list = arrays.get(i);
       
            if(list.get(0) < min){          
                min = list.get(0);
                minIndex = i;   
            }
            
            if(list.get(list.size() - 1) > max){          
                max = list.get(list.size() - 1);
                maxIndex = i;   
            }
                        
        }
        
        //If min & max indices are different, return
        if(minIndex != maxIndex) return max - min;
        
        //Otherwise, min & max indices are the same. Need to decide whether to:
        // - Keep min and find second highest max from another index
        // - Keep max and find second lowest min from another index
        
        int distMin = Integer.MIN_VALUE, distMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < maxIndex; i++){
            
            List<Integer> list = arrays.get(i);        
            distMin = Math.max(distMin, list.get(list.size() - 1) - min);
            distMax = Math.max(distMax, max - list.get(0));
            
        }

        for(int i = maxIndex + 1; i < arrays.size(); i++){
            
            List<Integer> list = arrays.get(i);        
            distMin = Math.max(distMin, list.get(list.size() - 1) - min);
            distMax = Math.max(distMax, max - list.get(0));
            
        }
        
        return Math.max(distMin, distMax);
    }
}