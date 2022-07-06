class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int current = 0;
        int max = 0;
    
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                current = prices[sell] - prices[buy];
                max = Math.max(current, max);
            } else {
                buy = sell;
            }
            
            sell++;
        }
        
        return max;
    }
}