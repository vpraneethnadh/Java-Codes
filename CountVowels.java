public class CountVowels {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int i1 = queries[i][0];
            int j1 = queries[i][1];
            int count = 0;

            for (int k = i1; k <= j1; k++) {
                if (startsAndEndsWithVowel(words[k]) == true)
                    count++;
            }
            result[i] = count;
        }
        return result;
    }

    private static boolean startsAndEndsWithVowel(String word) {
        char first = Character.toLowerCase(word.charAt(0));
        char last = Character.toLowerCase(word.charAt(word.length() - 1));
        return isVowel(first) && isVowel(last);
    }

    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String[] words = { "aba", "bcb", "ece", "aa", "e" };
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };

        int[] result = vowelStrings(words, queries);

        for (int res : result) {
            System.out.println(res);
        }
    }
}
