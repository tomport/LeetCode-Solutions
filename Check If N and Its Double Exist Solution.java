import java.util.*; 

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            if(nums.get(arr[i]*2) != null || (arr[i] % 2 == 0 & nums.get(arr[i] / 2) != null)){
                check = true;
            }
            else{
                nums.put(arr[i], true);
            }
        }
        return check;
    }
}