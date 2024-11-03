import java.util.*;

public class Anagram {
    public static boolean solve(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String res1 = "";
        String res2 = "";
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            res1 += ch;
        }
        for (int i = 0; i < arr2.length; i++) {
            char ch = arr2[i];
            res2 += ch;
        }

        return res1.equals(res2);
    }

    public static void main(String args[]) {
        String str1 = "abcdrty";
        String str2 = "ytrabcd";
        System.out.println(solve(str1, str2));
    }
}
