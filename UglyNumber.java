public class UglyNumber {
    public static boolean solve(int n) {
        if (n == 1)
            return true;
        else {
            while (n % 2 == 0)
                n /= 2;
            while (n % 3 == 0)
                n /= 3;
            while (n % 5 == 0)
                n /= 5;
        }
        if (n == 1)
            return true;
        return false;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(solve(n));
        int n1 = 14;
        System.out.println(solve(n1));
    }
}
