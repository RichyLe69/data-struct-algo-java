//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

/*
 * My thoughts
 * We want to pick the lowest valued day that comes before the highest valued day.
 * In other words, we can try to find the min and max, and make sure that the min comes before the max.
 * if the max comes before the min, and there are no scenarios that has at least 1 profit, we output 0
 */

/*
 * algo thoughts
 * Checking all combinations: Time complexity O(N^2)
 * Double for loop of x and y. check the difference between y and x. save highest profit
 */

public class bestTimeToBuyAndSellStock {


    public static int maxProfit(int[] prices){
        int max = 0;
        for(int x = 0; x < prices.length; x++){
            for(int y = x + 1; y < prices.length; y++){
                if(prices[y] - prices[x] > max){
                    max = prices[y] - prices[x];
                }
            }
        }
        return max;
    }

    public static void main(String args[]){

        int[] input = {7,1,5,3,6,4};
        int[] input2 = {7,6,4,3,1};
        int result = maxProfit(input2);
        System.out.println(result);


    }
}
