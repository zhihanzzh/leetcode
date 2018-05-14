class Solution {
    public int hammingDistance(int x, int y) {
        String xArr = Integer.toBinaryString(x);
        String yArr = Integer.toBinaryString(y);
        int count = 0;
        if(xArr.length() < yArr.length()){
            int j=xArr.length()-1;
            for(int i=yArr.length()-1; i>=0; i--){
                if(j>=0){
                    if(xArr.charAt(j) != yArr.charAt(i))
                        count++;
                    j--; 
                }else if(yArr.charAt(i) !='0'){
                    count++;
                }
            }
        }else{
            int j=yArr.length()-1;
            for(int i=xArr.length()-1; i>=0; i--){
                if(j>=0){
                    if(xArr.charAt(i) != yArr.charAt(j))
                        count++;
                    j--; 
                }else if(xArr.charAt(i) !='0'){
                    count++;
                }
            }
        }
        return count;
    }
}