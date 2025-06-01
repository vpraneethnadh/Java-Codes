public class RemovePrimeDigitsInString {
    public static boolean isPrime(int n) {
        n++;
        if (n == 1 || n == 2 || n == 3)
            return true;
        int ch = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                ch++;
        }
        if (ch == 0 || ch == 1 || ch == 2)
            return true;
        return false;
    }

    public static String removePrime(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (isPrime(i) == false)
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String argsp[]) {
        System.out.println(removePrime("ABCDEFGH"));
    }
}
