class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        
        HashMap<Character, Integer> tHash = new HashMap<>();
        HashMap<Character, Integer> windowHash = new HashMap<>();
        
        for (Character c : t.toCharArray()) {
            tHash.put(c, tHash.getOrDefault(c, 0) + 1);
        }
        
        int have = 0;
        int lRes = -1, rRes = -1, resLen = Integer.MAX_VALUE;
        
        int lP = 0;
        for (int rP = 0; rP < s.length(); rP++) {
            char c = s.charAt(rP);
            
            windowHash.put(c, windowHash.getOrDefault(c, 0) + 1);
            
            if (tHash.containsKey(c) && windowHash.get(c).intValue() == tHash.get(c).intValue()) {
                have++;
            }
            
            while (have == tHash.size()) {
                if (rP - lP + 1 < resLen) {
                    lRes = lP;
                    rRes = rP;
                    resLen = rP - lP + 1;
                }
                
                char currChar = s.charAt(lP);
                windowHash.put(currChar, windowHash.get(currChar).intValue() - 1);
                if (tHash.containsKey(currChar) && windowHash.get(currChar).intValue() < tHash.get(currChar).intValue()) {
                    have--;
                }
                lP++;
            }
        }
        
        return (resLen != Integer.MAX_VALUE) ? s.substring(lRes, rRes+1) : "";
    }
}