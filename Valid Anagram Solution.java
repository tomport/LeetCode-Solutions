/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> check = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            if(!check.containsKey(c)){
                check.put(c, 1);
            }
            else{
                check.replace(c, check.get(c) + 1);
            }
        }
        for(char c: t.toCharArray()){
           if(!check.containsKey(c)){
                return false;
            } 
            else if(check.get(c) == 1){
                check.remove(c);
            }
            else{
                check.replace(c, check.get(c) - 1);
            }
        }
        if(check.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}