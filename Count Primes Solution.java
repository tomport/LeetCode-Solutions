class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean[] check = new boolean[n];
        int count = n - 2;
        for(int i = 2; i < n; i++){
            check[i] = true;
        }

        for(int i = 2; i * i < n; i++){
            if (check[i] == true){
                for (int j = i * i; j < n; j += i) {
                    if(check[j]){
                        check[j] = false;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}