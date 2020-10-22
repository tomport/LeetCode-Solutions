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