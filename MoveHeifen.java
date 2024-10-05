public class MoveHeifen {
    public static void main(String args[]) {
        String str = "Move-Heifen-To-Front";
        String heifen = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                heifen += ch;
            else
                word += ch;
        }
        System.out.println(heifen + word);
    }
}
