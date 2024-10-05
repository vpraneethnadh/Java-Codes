public class MinParanthesisNeeded {
    public static void solve(String str) {
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                n1++;
            else if (ch == ')') {
                if (n1 > 0)
                    n1--;
                else
                    n2++;
            }
        }
        System.out.println(n1 + n2);
    }

    public static void main(String args[]) {
        String str = "(()))";
        solve(str);
        String str2 = "()()())))";
        solve(str2);
    }
}
