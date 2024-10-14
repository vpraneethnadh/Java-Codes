public class FactorialsTrailingZero {
    public static String fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return Integer.toString(f);
    }

    public static int trailingZeroes(int n) {
        String str = fact(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0')
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(trailingZeroes(5));
        System.out.println(trailingZeroes(10));
    }
}
