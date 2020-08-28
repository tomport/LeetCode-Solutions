class Solution {
    public int fib(int N){
        if(N == 0 || N == 1){
            return N;
        }
        else{
            return memo(N);
        }
    }
    public int memo(int N){
        int[] store = new int[N+1];
        store[1] = 1;
          for (int i = 2; i <= N; i++) {
              store[i] = store[i-1] + store[i-2];
          }
          return store[N];
    }
}