class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }
        boolean hasDecreased = false;
        boolean hasIncreased = false;
        for(int i = 1; i < A.length; i++){
            if(A[i] == A[i-1] || (A[i] > A[i-1] & hasDecreased == true)){
                return false;
            }
            else if(A[i] < A[i-1] & hasDecreased == false){
                hasDecreased = true;
            }
            else if(A[i] > A[i-1] & hasIncreased == false){
                hasIncreased = true;
            }
        }
        if(hasDecreased & hasIncreased){
            return true;
        }
        else{
            return false;
        }
    }
}