public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                res += str.charAt(i);
        }
        System.out.println(res);
    }
}
