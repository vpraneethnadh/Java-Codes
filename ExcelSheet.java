public class ExcelSheet {
    public static void solve(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            n--;
            res.append((char) ((n % 26) + 'A'));
            n /= 26;
        }
        System.out.println(res.reverse().toString());
    }

    public static void main(String args[]) {
        int n = 1;
        int n1 = 10;
        int n2 = 100;
        solve(n);
        solve(n1);
        solve(n2);
    }
}
