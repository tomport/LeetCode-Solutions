class Solution {
    public int fib(int N) {
        if(N == 0 || N == 1){
            return N;
        }
        else{
            return fib(N - 1) + fib(N - 2);
        }
    }
}