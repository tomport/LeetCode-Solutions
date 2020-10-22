class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> check = new HashSet<Integer>();
        for(int i: nums){
            if(check.contains(i)){
                check.remove(i);
            }
            else{
                check.add(i);
            }
        }
        for(int i: check){
            return i;
        }
        return 0;
    }
}