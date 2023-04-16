class Solution {
    public int reverse(int x) {
        long reversed = 0;
        boolean negative = (x < 0);
        if (negative) x *= -1;

        while (x > 0) {
            reversed = reversed*10 + x%10;
            x /= 10;
        }

        if (reversed > Integer.MAX_VALUE) return 0;
        if (negative) reversed *= -1;
        return (int) reversed;
    }
}