
public class MaximumProfitAnalyzer {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = prices[0];
        int maxProfit = 0;
        int buyPrice = prices[0];
        int sellPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
                buyPrice = minPrice;
                sellPrice = price;
            }

            if (price < minPrice) {
                minPrice = price;
            }
        }

        System.out.println("Best Buy Price: " + buyPrice);
        System.out.println("Best Sell Price: " + sellPrice);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}



Best Buy Price: 1
Best Sell Price: 6
Maximum Profit: 5
