import java.util.*;

public class PerfectNumberinRange {
    public static boolean isPerfect(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                arr.add(i);
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        if (sum == n)
            return true;
        return false;
    }

    public static void perfectRange(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i) == true)
                arr.add(i);
        }
        System.out.println(arr);
    }

    public static void main(String args[]) {
        perfectRange(10000);
    }
}
