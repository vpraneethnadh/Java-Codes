public class CountVCS {
    public static void main(String args[]) {
        String str = "Hello World".toLowerCase();
        int vcount = 0;
        int ccount = 0;
        int scount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vcount++;
            else if (ch == ' ')
                scount++;
            else {
                ccount++;
            }
        }
        System.out.println("Vowels: " + vcount);
        System.out.println("Consonents: " + ccount);
        System.out.println("Spaces: " + scount);
    }
}
