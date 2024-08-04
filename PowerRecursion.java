public class PowerRecursion {
    public static int power(int n, int m) {
        if (m == 0)
            return 1;
        else
            return n * power(n, m - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        System.out.println(power(n, m));
    }
}
