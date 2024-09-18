import java.util.*;

class AccentureFirstQuestion {
    public static void solve(int n, int val) {
        if (n <= 0 || n > 6) {
            System.out.println("Invalid input");
            return;
        } else {
            ArrayList<Integer> arr = new ArrayList<>();
            while (val != 0) {
                int r = val % 10;
                arr.add(r);
                val /= 10;
            }
            Collections.reverse(arr);

            int startIndex;
            if (n % 2 == 0)
                startIndex = 1;
            else
                startIndex = 0;

            int sum = 0;
            for (int i = startIndex; i < arr.size(); i += 2)
                sum += arr.get(i);
            System.out.println(sum);
        }
    }

    public static void main(String args[]) {
        int n = 2;
        int val = 643678;
        solve(n, val);
    }
}