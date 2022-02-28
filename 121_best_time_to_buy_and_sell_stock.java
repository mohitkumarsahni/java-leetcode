public class Main {
    public static void main(String[] args) {

        int[] prices = new int[]{2,4,1};

        System.out.println("Profit from stock: "+maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int price : prices) {
            if (price - min > profit) {
                profit = price - min;
            }
            if (min > price) {
                min = price;
            }
        }

        return profit;
    }
}
