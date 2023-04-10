public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int count = 32;
        
        while (count > 0) {
            result = result * 2 + (n & 1);
            n >>>= 1;
            count--;
        }
        
        return result;
    }
}
