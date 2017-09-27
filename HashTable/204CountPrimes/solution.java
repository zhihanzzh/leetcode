class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime =new boolean[n];
        for(int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        
        for(int i = 2; i < isPrime.length; i++){
            if(isPrime[i]){
                count++;
                for(int j = i * 2; j < isPrime.length; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        
        return count;
    }
}