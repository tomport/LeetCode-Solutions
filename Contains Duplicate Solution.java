class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<Integer>();
        for(int i: nums){
            if(check.contains(i)){
                return true;
            }
            check.add(i);
        }
        return false;
    }
}