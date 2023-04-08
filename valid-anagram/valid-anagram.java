class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hash.containsKey(c)) {
                int count = hash.get(c);
                hash.put(c, count+1);
            }
            
            else {
                hash.put(c, 1);
            }
        }
        
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            
            if (hash.containsKey(c)) {
                int count = hash.get(c);

                if (count == 1) {
                    hash.remove(c);
                }

                else {
                    hash.put(c, count-1);
                }
            }
            
            else {
                return false;
            }
        }
        
        return (hash.size() == 0);
    }
}