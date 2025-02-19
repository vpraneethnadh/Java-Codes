public class GCDStrings {
    public static boolean isValid(String str1, String str2, int k) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 % k > 0 || n2 % k > 0)
            return false;
        String base = str1.substring(0, k);
        return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
    }

    public static String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int len = Math.min(n1, n2);
        for (int i = len; i >= 1; --i) {
            if (isValid(str1, str2, i))
                return str1.substring(0, i);
        }
        return "";
    }

    public static void main(String args[]) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}