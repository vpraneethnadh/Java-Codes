public class ShiftingLetters {
    public static String applyShifts(String s, int[][] shifts) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];

            for (int j = start; j <= end; j++) {
                if (direction == 1)
                    chars[j] = (char) ((chars[j] - 'a' + 1) % 26 + 'a');
                else
                    chars[j] = (char) ((chars[j] - 'a' - 1 + 26) % 26 + 'a');
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        int[][] shifts1 = { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };
        System.out.println(applyShifts(s1, shifts1));

        String s2 = "dztz";
        int[][] shifts2 = { { 0, 0, 0 }, { 1, 1, 1 } };
        System.out.println(applyShifts(s2, shifts2));
    }
}
