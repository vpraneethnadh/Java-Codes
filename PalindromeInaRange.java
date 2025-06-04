import java.util.*;

public class PalindromeInaRange {
    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            str1.append(str.charAt(i));
        }
        String rev = str1.reverse().toString();
        if (str.equals(rev))
            return true;
        return false;
    }

    public static void PalinRange(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPalindrome(i) == true)
                arr.add(i);
        }
        System.out.println(arr);
    }

    public static void main(String args[]) {
        PalinRange(1000);
    }
}