class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        
        if (strs.length == 1) return strs[0];
        
        for (int i = 0; i < strs.length; i++) 
            if (strs[i].length() == 0) return "";
        
        
        int p = 0;
        String prefix = "";
        
        while(true) {
            boolean flag = true;
            
            if (p == strs[0].length()) break;
            char firstChar = strs[0].charAt(p);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= p || strs[i].charAt(p) != firstChar) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                prefix += firstChar;
            } else {
                break;
            }
            p++;
        }
        
        return prefix;
    }
}
// "flower","flow","flight"