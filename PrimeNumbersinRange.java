import java.util.*;

public class PrimeNumbersinRange {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count <= 2)
            return true;
        return false;
    }

    public static void PrimeRange(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) == true)
                arr.add(i);
        }
        System.out.println(arr);
    }

    public static void main(String args[]) {
        PrimeRange(100);
    }
}
