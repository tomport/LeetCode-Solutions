/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:
s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

Note: You may assume the string contains only lowercase English letters.
*/

class Solution {
    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        HashMap<Character, Integer> check = new HashMap<Character, Integer>();
        for(char c: str){
            if(!check.containsKey(c)){
                check.put(c, 1);
            }
            else{
                check.replace(c, check.get(c) + 1);
            }
        }
        for(int i = 0; i < str.length; i++){
            if(check.get(str[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}