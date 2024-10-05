public class PasswordChecker {
    public static int numeric(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                count++;
        }
        return count;
    }

    public static int capital(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        return count;
    }

    public static void CheckPassword(String pass, int len) {
        if (len < 4) {
            System.out.println("Invlid Password");
            return;
        }
        if (numeric(pass) < 1) {
            System.out.println("Invlid Password");
            return;
        }
        if (capital(pass) < 1) {
            System.out.println("Invlid Password");
            return;
        }
        for (int i = 0; i < len; i++) {
            if (pass.charAt(i) == ' ' || pass.charAt(i) == '/') {
                System.out.println("Invlid Password");
                return;
            }
        }
        System.out.println("Valid Password");
    }

    public static void main(String args[]) {
        String pass = "aA1_67";
        CheckPassword(pass, pass.length());

        String pass2 = "a987 abC012";
        CheckPassword(pass2, pass2.length());
    }
}
