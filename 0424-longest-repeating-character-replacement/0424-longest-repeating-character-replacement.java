class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFrequency = new int[26];
        int leftPointer = 0, rightPointer = 0;
        int maxCharFrequency = 0, longestSubstring = 0;

        // Iterate through the string using a sliding window approach
        while (rightPointer < s.length()) {
            char currentChar = s.charAt(rightPointer);
            charFrequency[currentChar - 'A']++;
            maxCharFrequency = Math.max(maxCharFrequency, charFrequency[currentChar - 'A']);

            int windowSize = rightPointer - leftPointer + 1;
            int replacementsNeeded = windowSize - maxCharFrequency;

            // If we need more replacements than allowed, shrink the window
            if (replacementsNeeded > k) {
                charFrequency[s.charAt(leftPointer) - 'A']--;
                leftPointer++;
            } else {
                // Update longest substring only if the current window is valid
                longestSubstring = Math.max(longestSubstring, windowSize);
            }
            rightPointer++;
        }

        return longestSubstring;
    }
}
