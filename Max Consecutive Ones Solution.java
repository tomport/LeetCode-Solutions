class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int streak = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                if(count > streak){
                    streak = count;
                }
            }
            else if(num == 0){
                count = 0;
            }

        }
        return streak;
    }
}