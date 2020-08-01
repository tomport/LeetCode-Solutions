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