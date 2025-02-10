public class ReverseVowels {
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'U' || ch == 'u')
            return true;
        return false;
    }

    public static String reverseVowels(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        int n1 = s.length();
        int i = 0;
        int j = n1 - 1;
        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (isVowel(ch1) && isVowel(ch2)) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!isVowel(ch1))
                i++;
            else if (!isVowel(ch2))
                j--;
        }
        StringBuilder res = new StringBuilder("");
        for (int k = 0; k < arr.length; k++)
            res.append(arr[k]);
        return res.toString();
    }

    public static void main(String args[]) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }
}