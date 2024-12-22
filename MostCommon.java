import java.util.*;

public class MostCommon {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String str1 = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String[] words = str1.split("\\s+");

        Set<String> banSet = new HashSet<>();
        for (int i = 0; i < banned.length; i++)
            banSet.add(banned[i].toLowerCase());

        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!banSet.contains(words[i]))
                count.put(words[i], count.getOrDefault(words[i], 0) + 1);
        }

        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
