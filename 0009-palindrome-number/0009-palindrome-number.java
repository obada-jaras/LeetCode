class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int reversed = reverse(x);
        
        while (x > 0) {
            if (x%10 != reversed%10) return false;
            x /= 10;
            reversed /= 10;
        }
        
        return true;
    }
    
    private int reverse(int x) {
        int reversed = 0;
        
        while (x > 0) {
            reversed = reversed*10 + x%10;
            x /= 10;
        }
        
        return reversed;
    }
}