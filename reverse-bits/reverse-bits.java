public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        int count = 32;
        
        while (count > 0) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
            count--;
        }
        
        return result;
    }
}
