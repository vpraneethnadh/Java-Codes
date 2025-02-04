class MaxAscendingSubarraySum {
    public static int findMaxSum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length && arr[j] > arr[j - 1]; j++) {
                sum += arr[j];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 5, 10, 50 };
        int[] arr2 = { 10, 20, 30, 40, 50 };
        int[] arr3 = { 12, 17, 15, 13, 10, 11, 12 };

        System.out.println(findMaxSum(arr1));
        System.out.println(findMaxSum(arr2));
        System.out.println(findMaxSum(arr3));
    }
}
