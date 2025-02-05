public class OneSwap {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        int n = s1.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                char[] arr = s1.toCharArray();
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (new String(arr).equals(s2))
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
        System.out.println(areAlmostEqual("kelb", "kelb"));
    }
}