import java.util.*;

public class StringAnagram {
    public static void isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram, Wrong Input!");
        } else {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
    
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = "Elhlorlodw";
        isAnagram(s1, s2);
    }
}
