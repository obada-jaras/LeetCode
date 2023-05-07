class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        int[] tFrequency = new int[128];
        int[] windowFrequency = new int[128];

        for (char c : t.toCharArray()) {
            tFrequency[c]++;
        }

        int have = 0, need = t.length();
        int lRes = -1, rRes = -1, resLen = Integer.MAX_VALUE;

        int lP = 0;
        for (int rP = 0; rP < s.length(); rP++) {
            char c = s.charAt(rP);
            windowFrequency[c]++;

            if (tFrequency[c] > 0 && windowFrequency[c] <= tFrequency[c]) {
                have++;
            }

            while (have == need) {
                if (rP - lP + 1 < resLen) {
                    lRes = lP;
                    rRes = rP;
                    resLen = rP - lP + 1;
                }

                char currChar = s.charAt(lP);
                windowFrequency[currChar]--;
                if (tFrequency[currChar] > 0 && windowFrequency[currChar] < tFrequency[currChar]) {
                    have--;
                }
                lP++;
            }
        }

        return (resLen != Integer.MAX_VALUE) ? s.substring(lRes, rRes + 1) : "";
    }
}
