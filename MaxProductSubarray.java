public class MaxProductSubarray {
    public static void maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        System.out.println("Maximum product is " + result);
    }

    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        maxSubArraySum(arr);
    }
}
