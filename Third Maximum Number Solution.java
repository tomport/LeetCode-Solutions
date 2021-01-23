/*
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/

class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(first < nums[i]){
                third = second;
                second = first;
                first = nums[i];
            }
            else if((second < nums[i] && first != nums[i]) || first == second){
                third = second;
                second = nums[i];
            }
            else if((third < nums[i] && first != nums[i] && second != nums[i]) || first == third ||  second == third){
                third = nums[i];
            }
        }
        if(first == second || first == third || second == third){
            return first;
        }
        else{
            return third;
        }
    }   
}