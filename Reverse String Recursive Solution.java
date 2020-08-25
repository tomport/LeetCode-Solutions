class Solution {
    public void reverseString(char[] s) {
        helper(0, s);
    }
    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length / 2) {
            return;
        }
        else{
            char temp = str[index];
            str[index] = str[str.length - 1 - index];
            str[str.length - 1 - index] = temp;
            helper(index + 1, str);
        }
    }
}