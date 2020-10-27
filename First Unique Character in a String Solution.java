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