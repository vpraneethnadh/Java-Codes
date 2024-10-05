import java.util.*;

public class RearrandeinIncandDecOrder {
    public static void solve(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            System.out.print(arr[i] + " ");
        for (int i = n - 1; i > n / 2; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int[] arr = { 8, 7, 1, 6, 5, 9 };
        solve(arr);
    }
}
