public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello World".toLowerCase();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                res += ch;
        }
        System.out.println(res);
    }
}