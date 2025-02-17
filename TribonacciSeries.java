public class TribonacciSeries {
    public static int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int a1 = 0;
        int a2 = 1;
        int a3 = 1;
        for (int i = 3; i <= n; i++) {
            int a4 = a1 + a2 + a3;
            a1 = a2;
            a2 = a3;
            a3 = a4;
        }
        return a3;
    }

    public static void main(String args[]) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }
}