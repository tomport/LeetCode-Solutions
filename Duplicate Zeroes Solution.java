class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int length = arr.length - 1;
        for(int i = 0; i <= length - count; i++){
            if(arr[i] == 0 && i == length - count){
                arr[length] = 0;
                length--;
                break;
            }
             if(arr[i] == 0){
                count++;
            }
        }
        
        for(int i = length - count; i >= 0; i--){
            arr[i+count] = arr[i];
            if(arr[i]== 0){
                count--;
                arr[i+count] = 0;
            }
        }
        
        


    }
}