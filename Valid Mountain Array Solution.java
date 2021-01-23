/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:
Input: arr = [2,1]
Output: false

Example 2:
Input: arr = [3,5,5]
Output: false

Example 3:
Input: arr = [0,3,2,1]
Output: true

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 104
*/

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