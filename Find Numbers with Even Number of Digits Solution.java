class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int num : nums){
            if(String.valueOf(num).length() % 2 == 0){
                even++;
            }
        }
        return even;
    }
}