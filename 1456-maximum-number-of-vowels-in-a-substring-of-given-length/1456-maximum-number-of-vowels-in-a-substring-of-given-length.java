import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int max = 0;
        int currMax = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                currMax++;
            }
            if (i >= k) {
                if (vowels.contains(s.charAt(i - k))) {
                    currMax--;
                }
            }
            max = Math.max(max, currMax);
        }

        return max;
    }
}
