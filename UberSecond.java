public class UberSecond {
    public static void solve(String str) {
        if (str.length() == 0)
            System.out.println("String is null");
        else {
            if (str.length() % 2 != 0)
                System.out.println("False");
            else {
                String first = "";
                String second = "";
                int n = str.length();
                first = str.substring(0, n / 2);
                second = str.substring(n / 2, n);
                if (first.equals(second)) {
                    System.out.println("True");
                    System.out.println(str);
                } else {
                    System.out.println("False");
                    System.out.println(str);
                }
            }
        }
    }

    public static void main(String args[]) {
        String str = "abab";
        solve(str);

        String str2 = "abcabd";
        solve(str2);
    }
}
