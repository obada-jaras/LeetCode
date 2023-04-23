class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int leftIndex = 0, max = 0;
        
        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            char currentChar = s.charAt(rightIndex);
            if (map.containsKey(currentChar) && map.get(currentChar) >= leftIndex) {
                leftIndex = map.get(currentChar) + 1;
            }
            
            map.put(currentChar, rightIndex);
            max = Math.max(max, rightIndex - leftIndex + 1);
        }
        
        return max;
    }
}
