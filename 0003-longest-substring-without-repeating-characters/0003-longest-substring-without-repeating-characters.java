class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int leftIndex = 0, rightIndex = 0, max = 0;
        
        while (rightIndex < s.length()) {
            if (set.contains(s.charAt(rightIndex))) {
                set.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            
            else {
                set.add(s.charAt(rightIndex));
                max = Math.max(max, rightIndex - leftIndex + 1);
                rightIndex++;
            }
        }
        
        return max;
    }
}