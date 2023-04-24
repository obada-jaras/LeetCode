class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int leftIndex = 0, rightIndex = 0;
        int maxCount = 0;
        int maxLength = 0;
        
        while (rightIndex < s.length()) {
            char ch = s.charAt(rightIndex);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, hash.get(ch));
            
            int windowSize = rightIndex - leftIndex + 1;
            int neededReplacements = windowSize - maxCount;
            
            if (neededReplacements > k) {
                char leftChar = s.charAt(leftIndex);
                hash.put(leftChar, hash.get(leftChar) - 1);
                leftIndex++;
            } else {
                maxLength = Math.max(maxLength, windowSize);
            }
            
            rightIndex++;
        }
        
        return maxLength;
    }
}
