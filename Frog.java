public class Frog {
    public static int solve(String str) {
        int count = 0;
        int len = str.length();
        int lcount = 0;
        int rcount = 0;
        int max = 0;
        for (int i = 1; i < len - 1; i++) {
            if (str.charAt(i) == 'L')
                lcount++;
            if (str.charAt(i) == 'R')
                rcount++;
        }
        if (rcount == 0 || lcount == 0)
            count = 1;

        else {
            for (int i = 1; i < len - 1; i++) {
                // int j = 0;
                int c = 0;
                while (str.charAt(i) != 'R') {
                    c++;
                    // j ++;
                }
                max = c;
            }
        }
        count = max;
        return count;
    }

    public static void main(String args[]) {
        String str1 = "SLLLLLLD";
        String str2 = "SLRLRLRD";
        String str3 = "SRLLLLLLRD";
        String str4 = "SRRRRRRD";
        System.out.println(solve(str1));
        System.out.println(solve(str2));
        System.out.println(solve(str3));
        System.out.println(solve(str4));
    }
}
