class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int currMax = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currMax++;
            }
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    currMax--;
                }
            }
            max = Math.max(max, currMax);
        }

        return max;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
