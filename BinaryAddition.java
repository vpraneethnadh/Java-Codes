public class BinaryAddition {
    public static void badd(String str1, String str2) {
        int n = str1.length() - str2.length();
        char[] charr = new char[str1.length()];
        char carry = '0';

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                str2 = "0" + str2;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                str1 = "0" + str1;
            }
        }

        for (int i = str1.length() - 1; i >= 0; i--) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            int sum = (ch1 - '0') + (ch2 - '0') + (carry - '0');
            if (sum == 0) {
                charr[i] = '0';
                carry = '0';
            } else if (sum == 1) {
                charr[i] = '1';
                carry = '0';
            } else if (sum == 2) {
                charr[i] = '0';
                carry = '1';
            } else if (sum == 3) {
                charr[i] = '1';
                carry = '1';
            }
        }
        if (carry == '1') {
            System.out.print(carry);
        }

        for (int i = 0; i < charr.length; i++) {
            System.out.print(charr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str1 = "10001";
        String str2 = "101";

        badd(str1, str2);
    }
}
