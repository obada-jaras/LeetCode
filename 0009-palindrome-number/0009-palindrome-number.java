class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int reversed = reverse(x);
        // if (reversed == -1) return false;
        
        while (x > 0) {
            if (x%10 != reversed%10) return false;
            x /= 10;
            reversed /= 10;
        }
        
        return true;
    }
    
    private int reverse(int x) {
        long reversed = 0;
        
        while (x > 0) {
            reversed = reversed*10 + x%10;
            x /= 10;
        }
        
        if (reversed > Integer.MAX_VALUE) return -1;
        return (int)reversed;
    }
}