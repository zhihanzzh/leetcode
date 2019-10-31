class Solution {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        
        int[] res = new int[N + 1];
        res[1] = 1;
        for (int i = 2; i <= N; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        
        return res[N];
    }
}
