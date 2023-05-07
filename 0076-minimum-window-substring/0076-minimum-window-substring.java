class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        int[] targetFrequency = new int[128];
        int[] windowFrequency = new int[128];

        for (char c : t.toCharArray()) {
            targetFrequency[c]++;
        }

        int matchedCharacters = 0, targetLength = t.length();
        int leftResult = -1, rightResult = -1, minLength = Integer.MAX_VALUE;

        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char currentChar = s.charAt(rightPointer);
            windowFrequency[currentChar]++;

            if (targetFrequency[currentChar] > 0 && windowFrequency[currentChar] <= targetFrequency[currentChar]) {
                matchedCharacters++;
            }

            while (matchedCharacters == targetLength) {
                if (rightPointer - leftPointer + 1 < minLength) {
                    leftResult = leftPointer;
                    rightResult = rightPointer;
                    minLength = rightPointer - leftPointer + 1;
                }

                char removedChar = s.charAt(leftPointer);
                windowFrequency[removedChar]--;
                if (targetFrequency[removedChar] > 0 && windowFrequency[removedChar] < targetFrequency[removedChar]) {
                    matchedCharacters--;
                }
                leftPointer++;
            }
        }

        return (minLength != Integer.MAX_VALUE) ? s.substring(leftResult, rightResult + 1) : "";
    }
}
