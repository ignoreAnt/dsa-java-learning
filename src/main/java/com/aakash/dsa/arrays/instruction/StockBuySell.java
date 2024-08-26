package com.aakash.dsa.arrays.instruction;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {1, 5, 3, 8, 12};

        System.out.println("Maximum Profit: " + maxProfitV2(prices));
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        // Base case: if the array is empty or has one element, profit is 0
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int profit = 0;

        // Traverse through each price
        for (int i = 1; i < prices.length; i++) {
            // If the price at the next day is higher,
            // add the difference to the profit
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static int maxProfitV2(int[] prices){
        if (prices == null || prices.length < 2){
            return 0;
        }

        int index = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice){
                buyPrice = prices[i];
                index = i;
            }
        }

        int sellPrice = prices[index + 1];
        for (int i = index + 1; i < prices.length; i++) {
            if (sellPrice < prices[i]){
                sellPrice = prices[i];
            }
        }

        return sellPrice - buyPrice;
    }
}
