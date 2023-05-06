class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int p1 = 0, p2 = 0;
        
        while (p2 < k) {
            char c = s.charAt(p2);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') max++;
            p2++;
        }
        
        int currMax = max;
        while (p2 < s.length()) {
            char c1 = s.charAt(p1);
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') currMax--;
            p1++;
            
            char c2 = s.charAt(p2);
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') currMax++;
            p2++;
            
            max = Math.max(max, currMax);
        }
        
        return max;
    }
}