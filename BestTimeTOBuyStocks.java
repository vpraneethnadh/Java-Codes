public class BestTimeTOBuyStocks {
    public static void buyStocks(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        buyStocks(arr);
        buyStocks(arr2);
    }
}