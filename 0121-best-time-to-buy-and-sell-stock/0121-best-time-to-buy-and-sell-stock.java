class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null){
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int currentProfit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit,currentProfit);
        }

        return maxProfit;
    }
}