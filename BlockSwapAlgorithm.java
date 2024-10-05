public class BlockSwapAlgorithm {
    public static void solve(int[] arr, int k) {
        for (int i = k; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        solve(arr, k);
    }
}
