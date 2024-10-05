import java.util.*;

public class Median {
    public static void solve(double[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            double mid1 = arr[n / 2 - 1];
            double mid2 = arr[n / 2];
            System.out.println((mid1 + mid2) / 2.0);
        } else {
            double x = arr[n / 2];
            System.out.printf("%.1f\n", x);
        }
    }

    public static void main(String args[]) {
        double[] arr = { 4, 7, 1, 2, 5, 6 };
        solve(arr);
    }
}
