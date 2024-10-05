public class BinaryOperation {
    public static void solve(String str) {
        int res = 0;
        if (str.length() % 2 == 0)
            System.out.println("Worng Input!");
        else {
            int x1 = str.charAt(0) - '0';
            for (int i = 1; i < str.length(); i += 2) {
                int x2 = str.charAt(i + 1) - '0';
                if (str.charAt(i) == 'A')
                    res = x1 & x2;
                else if (str.charAt(i) == 'B')
                    res = x1 | x2;
                else if (str.charAt(i) == 'C')
                    res = x1 ^ x2;
                x1 = res;
            }
            System.out.println(res);
        }
    }

    public static void main(String args[]) {
        String str = "1C0C1C1A0B1";
        solve(str);
    }
}
