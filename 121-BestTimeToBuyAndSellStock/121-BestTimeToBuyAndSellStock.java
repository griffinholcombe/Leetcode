// Last updated: 5/26/2026, 11:18:19 AM
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
           if (buy > prices[i]){
            buy = prices[i];
           }
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }
}