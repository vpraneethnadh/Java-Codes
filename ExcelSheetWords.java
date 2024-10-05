public class ExcelSheetWords {
    public static void solve(String str) {
        int res = 0;
        for (char c : str.toCharArray())
            res = res * 26 + (c - 'A' + 1);
        System.out.println(res);
    }

    public static void main(String args[]) {
        String str = "A";
        String str1 = "AB";
        String str2 = "ZY";
        solve(str);
        solve(str1);
        solve(str2);
    }
}
