public class HarshadNumber {
    public static void solve(int x) {
        int n = x;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        if (x % sum == 0)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void main(String args[]) {
        solve(18);
        solve(11);
    }
}
