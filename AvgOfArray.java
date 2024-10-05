public class AvgOfArray {
    public static void solve(int[] arr) {
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        double avg = sum / n;
        System.out.printf("%.1f%n", avg);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 1, 5, 1 };
        solve(arr);
    }
}
