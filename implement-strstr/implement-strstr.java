class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        int pHaystack = 0, pNeedle = 0;
        int partialMatchStart = 0;
        
        while (pHaystack < haystack.length()) {
            if (haystack.charAt(pHaystack) == needle.charAt(pNeedle)) {
                pHaystack++;
                pNeedle++;
            } else {
                partialMatchStart++;
                pHaystack = partialMatchStart;
                pNeedle = 0;
            }
            
            if (pNeedle == needle.length()) return pHaystack - pNeedle;
        }
        
        return -1;
    }
}
