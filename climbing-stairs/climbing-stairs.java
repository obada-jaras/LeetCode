class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        
        return waysCount(n);
    }
        
    private int waysCount(int n) {
        if (n == 0 || n == 1) return 1;

        if (memo[n] != 0) return memo[n];

        memo[n] = waysCount(n-1) + waysCount(n-2);
        return memo[n];
    }
}