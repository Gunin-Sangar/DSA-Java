package Basics;

public class A0017BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {120, 54, 56, 78, 84, 10};

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : arr){
            if(price < buyPrice){
                buyPrice = price;
            }

            int profit = price - buyPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("maxProfit : " + maxProfit);
    }
}