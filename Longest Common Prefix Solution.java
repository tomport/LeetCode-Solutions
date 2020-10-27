class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        int max = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < max){
                max = strs[i].length();
            }
        }
        for(int i = 0; i < max; i++){
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0, i);   
                }
            }
        }
        return strs[0].substring(0, max);
    }
}