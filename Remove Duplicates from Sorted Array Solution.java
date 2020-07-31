class Solution {
    public int removeDuplicates(int[] nums) {
    int newLength = 0;
        
    for(int i = 0; i < nums.length; i++){
        if(i == 0 || nums[i] != nums[newLength-1]){
            nums[newLength] = nums[i];
            newLength++;
            }
        }

    return newLength;     
    }
}