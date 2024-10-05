public class AvgAndSum {
    public static void solve(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / arr.length));
    }

    public static void main(String args[]) {
        int[] arr = { 12, 13, 14, 15, 16, 17, 18 };
        solve(arr);
    }
}
