/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '('){
                        return false;
                    }
                    else{
                        stack.pop();
                        break;
                    }
                case ']':
                    if(stack.isEmpty() || stack.peek() != '['){
                        return false;
                    }
                    else{
                        stack.pop();
                        break;
                    }
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{'){
                        return false;
                    }
                    else{
                        stack.pop();
                        break;
                    }
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}