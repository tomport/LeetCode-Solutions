class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length -1;

        while(left < right){
            if(A[left] % 2 != 0 && A[right] % 2 == 0){
                int temp = A[right];
                A[right] = A[left];
                A[left] = temp;
            }
            if(A[left] % 2 == 0){
                left++;
            }
            if(A[right] % 2 != 0){
                right--;
            }            
        }
        return A;
    }
}