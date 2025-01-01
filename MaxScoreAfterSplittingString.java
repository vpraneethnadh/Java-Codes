public class MaxScoreAfterSplittingString {
    public static int maxScore(String s) {
        int n = s.length();
        int ones = 0;
        int zero = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0')
                zero++;
            else
                ones--;
            score = Math.max(score, zero + ones);
        }
        return score;
    }

    public static void main(String args[]) {
        String s1 = "011101";
        String s2 = "00111";
        String s3 = "0000";
        String s4 = "1111";

        System.out.println(maxScore(s1));
        System.out.println(maxScore(s2));
        System.out.println(maxScore(s3));
        System.out.println(maxScore(s4));
    }
}
