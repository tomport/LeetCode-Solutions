class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        else if (n == 1){
            return x;
        }
        else if(n == -1){
            return 1/x;
        }
        else{
            double temp = myPow(x, n/2);
            double ans = temp * temp;
            if(n > 0 && n % 2 != 0){
                ans = ans * x;
            }
            else if(n < 0 && n % 2 != 0){
                ans = ans * 1/x;
            }
            return ans;
        }
    }
}