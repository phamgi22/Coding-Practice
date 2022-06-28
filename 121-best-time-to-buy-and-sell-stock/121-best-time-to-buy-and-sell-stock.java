class Solution {
    public int maxProfit(int[] prices) {
        // thought: 
        // left is buy
        // right is sell
        
        int profit = 0;
        int maxProfit = 0;
        int l = 0;
        int r = 0;
        
        for (int i=0; i<prices.length; i++) {
            if(prices[l] < prices[r]) {
                profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            
            r++;
        }
        
        return maxProfit;
    }
}