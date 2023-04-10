class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 0, max = 0;
        
        while (right < prices.length) {
            if (prices[left] < prices[right])
                max = max < (prices[right] - prices[left]) ? prices[right] - prices[left] : max;
            
            else
                left = right;
            
            right++;
        }
        
        return max;
    }
}