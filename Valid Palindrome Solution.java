class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        s = s.toLowerCase();
        char[] temp = s.toCharArray();
        int i = 0, j = temp.length - 1;
        while(i < j){
            while(i < temp.length && Character.isLetterOrDigit(temp[i]) != true){ 
                i++; 
            }
            while(j >= 0 && Character.isLetterOrDigit(temp[j]) != true){ 
                j--; 
            }
            if(i < j && temp[i++] != temp[j--]){
                return false;
            }
            
        }
        return true;
    }
}