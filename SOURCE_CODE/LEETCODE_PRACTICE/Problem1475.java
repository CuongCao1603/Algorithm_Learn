package LEETCODE_PRACTICE;

public class Problem1475 {
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};

        int[] newPrice = finalPrices(prices);
        System.out.println("Rs: ");
        for (int i = 0; i < newPrice.length; i++) {
            System.out.print(newPrice[i] + " ");
        }
    }
}
