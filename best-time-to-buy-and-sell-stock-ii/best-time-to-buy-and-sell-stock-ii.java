class Solution {
    public int maxProfit(int[] prices) {        
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int temp = prices[i+1] - prices[i];
            if (temp > 0) profit += temp;
        }
        
        return profit;
    }
}