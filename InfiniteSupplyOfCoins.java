import java.util.*;

public class InfiniteSupplyOfCoins {
    public static int InfiniteSupply(int[] arr, int n, int tar) {
        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= tar; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }
        return dp[tar];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(InfiniteSupply(arr, n, target));
        sc.close();
    }
}
