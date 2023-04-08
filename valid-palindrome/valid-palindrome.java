class Solution {
    public boolean isPalindrome(String s) {
        s = cleanText(s);
        System.out.println(s);
        
        int p1 = 0, p2 = s.length()-1;
        
        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) return false;
            p1++;
            p2--;
        }
        
        return true;
    }
    
    
    private String cleanText(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                newStr += Character.toLowerCase(c);
            
            if ((c >= 'a' && c <= 'z' ) || (c >= '0' && c <= '9')) 
                newStr += c;
        }
        
        return newStr;
    }
}