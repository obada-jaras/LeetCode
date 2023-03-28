class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) return;
        reverse(s, 0, s.length-1);
    }
    
    
    private void reverse(char[] s, int low, int high) {
        if (high - low <= 0) return;
        swap(s, low, high);
        reverse(s, low+1, high-1);
    }
    
    
    private void swap(char[] s, int low, int high) {
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
    }
}