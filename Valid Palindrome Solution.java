/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false
 
Constraints:
s consists only of printable ASCII characters.
*/

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