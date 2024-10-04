class PalindromeFromNtoM {
    public static boolean pal(int n) {
        String x = Integer.toString(n);
        String str = Integer.toString(n);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        if (x.equals(rev))
            return true;
        return false;
    }

    public static void solve(int n, int m) {
        int count = 0;
        for (int i = n; i < m; i++) {
            if (pal(i) == true)
                count++;
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        int n = 100;
        int m = 200;
        solve(n, m);
    }
}
