public class ArmstrongNumber {
    public static void arm(int n) {
        int sum = 0;
        int n1 = n;
        while (n != 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        if (sum == n1)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String args[]) {
        int n = 153;
        int n1 = 243;
        arm(n);
        arm(n1);
    }
}
