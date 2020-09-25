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