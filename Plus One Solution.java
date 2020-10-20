class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        if(digits[i] != 9){
            digits[i] = digits[i] + 1;
            return digits;
        }
        else{
            boolean carry = true;
            while(i > -1){
                if(digits[i] != 9){
                    digits[i] = digits[i] + 1;
                    carry = false;
                    break;
                }
                else{
                    digits[i] = 0;
                    i--;
                }
            }
            if(!carry){
                return digits;
            }
            else{
                int[] ans = new int[digits.length + 1];
                for(i = 0; i < digits.length; i++){
                    ans[i+1] = digits[i];
                    }
                ans[0] = 1;
                return ans;
                }
        }
    }
}