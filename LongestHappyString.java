public class LongestHappyString {
    public static String longHappy(int a, int b, int c) {
        int len = a + b + c;
        int index = 0;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        StringBuilder str = new StringBuilder();
        while (index < len) {
            if (a >= b && a >= c && a1 < 2 || (a > 0 && (b1 == 2 || c1 == 2))) {
                str.append('a');
                b1 = 0;
                c1 = 0;
                a1++;
                a--;
            } else if (b >= c && b >= a && b1 < 2 || (b > 0 && (a1 == 2 || c1 == 2))) {
                str.append('b');
                a1 = 0;
                c1 = 0;
                b1++;
                b--;
            } else if (c >= a && c >= b && c1 < 2 || (c > 0 && (b1 == 2 || a1 == 2))) {
                str.append('c');
                a1 = 0;
                b1 = 0;
                c1++;
                c--;
            }
            index++;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(longHappy(1, 1, 7));
    }
}