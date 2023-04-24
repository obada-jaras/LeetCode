class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, right = 0;
        int maxCount = 0, maxLength = 0;
        
        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            int windowSize = right - left + 1;
            int neededReplacements = windowSize - maxCount;
            if (neededReplacements > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            else {
                maxLength = Math.max(maxLength, windowSize);
            }
            right++;
        }
        
        return maxLength;
    }
}