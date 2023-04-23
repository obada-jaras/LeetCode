class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
                right++; // Move the right pointer forward
            } else {
                set.remove(s.charAt(left));
                left++; // Move the left pointer forward
            }
        }
        
        return max;
    }
}