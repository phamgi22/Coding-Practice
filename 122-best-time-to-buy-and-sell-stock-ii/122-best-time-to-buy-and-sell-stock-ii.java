class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            int current = prices[i+1] - prices[i];
            if (current > 0) profit += current;
        }
        
        return profit;
    }
}