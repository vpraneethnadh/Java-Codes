public class StrictlyIncreasingOrDecreasing {
    public static int longestMonotonicSubarray(int[] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1])
                    len++;
                else
                    break;
            }
            maxLen = Math.max(maxLen, len);
        }
        for (int i = 0; i < arr.length; i++) {
            int len = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1])
                    len++;
                else
                    break;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 4, 3, 3, 2 };
        int[] arr2 = { 3, 3, 3, 3 };
        int[] arr3 = { 1, 2, 3 };

        System.out.println(longestMonotonicSubarray(arr1));
        System.out.println(longestMonotonicSubarray(arr2));
        System.out.println(longestMonotonicSubarray(arr3));
    }
}
