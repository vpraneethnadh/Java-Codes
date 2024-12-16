import java.util.HashMap;
import java.util.HashSet;

public class uniqueMorseRepresentations {
    public static void calculation(String[] words) {
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('a', ".-");
        hm.put('b', "-...");
        hm.put('c', "-.-.");
        hm.put('d', "-..");
        hm.put('e', ".");
        hm.put('f', "..-.");
        hm.put('g', "--.");
        hm.put('h', "....");
        hm.put('i', "..");
        hm.put('j', ".---");
        hm.put('k', "-.-");
        hm.put('l', ".-..");
        hm.put('m', "--");
        hm.put('n', "-.");
        hm.put('o', "---");
        hm.put('p', ".--.");
        hm.put('q', "--.-");
        hm.put('r', ".-.");
        hm.put('s', "...");
        hm.put('t', "-");
        hm.put('u', "..-");
        hm.put('v', "...-");
        hm.put('w', ".--");
        hm.put('x', "-..-");
        hm.put('y', "-.--");
        hm.put('z', "--..");

        HashSet<String> uniqueHash = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                res.append(hm.get(word.charAt(j)));
            }
            uniqueHash.add(res.toString());
        }
        System.out.println(uniqueHash.size());
    }

    public static void main(String args[]) {
        String[] arr1 = { "gin", "zen", "gig", "msg" };
        String[] arr2 = { "a" };
        calculation(arr1);
        calculation(arr2);
    }
}