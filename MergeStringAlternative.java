public class MergeStringAlternative {
    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder str = new StringBuilder();
        int minLength = Math.min(n1, n2);
        for (int i = 0; i < minLength; i++) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if (n1 > n2)
            str.append(word1.substring(minLength));
        else if (n2 > n1)
            str.append(word2.substring(minLength));
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}