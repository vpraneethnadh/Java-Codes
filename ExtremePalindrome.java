public class ExtremePalindrome {
    public static void checkpal(String str) {
        String str2 = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                str2 += ch;
            }
        }
        String str3 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            str3 += str2.charAt(i);
        }
        if (str2.equals(str3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str = "A@#123 a";
        checkpal(str);
    }
}
