public class DiffbwSum {
    public static void differenceofSum(int n, int m) {
        int sumDivisible = 0;
        int sumNotDivisible = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                sumDivisible += i;
            else
                sumNotDivisible += i;
        }
        System.out.println(Math.abs(sumNotDivisible - sumDivisible));
    }

    public static void main(String args[]) {
        int n = 4;
        int m = 20;
        differenceofSum(n, m);
    }
}
