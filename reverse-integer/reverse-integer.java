class Solution {
    public int reverse(int x) {
        try {
            if (x < 0) {
                String numberStr = "" + -1 * x;
                String reversed = reverseString(numberStr.toCharArray());
                return -1 * Integer.parseInt(reversed);
            }

            else {
                String numberStr = "" + x;
                String reversed = reverseString(numberStr.toCharArray());
                return Integer.parseInt(reversed);
            }
        } catch (Exception e) {
            return 0;
        }
        
    }
    
    public String reverseString(char[] s) {
        if (s.length == 0) return "";
        reverse(s, 0, s.length-1);
        return new String(s);
    }
    
    
    private void reverse(char[] s, int low, int high) {
        if (high <= low) return;
        swap(s, low, high);
        reverse(s, low+1, high-1);
    }
    
    
    private void swap(char[] s, int low, int high) {
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
    }
}