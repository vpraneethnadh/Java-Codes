import java.util.*;

public class RatCountHouse {
    public static int solve(int r, int unit, int n, int[] arr) {
        int total = r * unit; // 14
        int count = 0;
        int sum = 0;
        if (arr.length == 0)
            return -1;
        else {
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                count++;
                if (sum >= total)
                    break;
            }
            if (sum < total)
                return 0;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(r, unit, n, arr));
        sc.close();
    }
}
