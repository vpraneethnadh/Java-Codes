import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static boolean sub(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < s1.length(); j++) {
                if (i + j >= s2.length() || s2.charAt(i + j) != s1.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return true;
        }
        return false;
    }

    public static List<String> stringMatching(String[] words) {
        int n = words.length;
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (sub(words[i], words[j]) == true) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        String[] words1 = { "mass", "as", "hero", "superhero" };
        String[] words2 = { "leetcode", "et", "code" };

        List<String> res1 = stringMatching(words1);
        List<String> res2 = stringMatching(words2);

        System.out.println(res1);
        System.out.println(res2);
    }
}
