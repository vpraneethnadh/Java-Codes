public class KadensAlgorithm {
    public static void maxSubArraySum(int[] arr) {
        int max = arr[0];
        int max2 = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            max2 = Math.max(arr[i], max2 + arr[i]);
            max = Math.max(max, max2);
        }
        System.out.println("Maximum contiguous sum is " + max);

    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(arr);
    }
}

