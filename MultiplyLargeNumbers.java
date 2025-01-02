import java.math.BigInteger;

public class MultiplyLargeNumbers {
    public static String multiply(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);

        BigInteger res = big1.multiply(big2);
        return res.toString();
    }

    public static void main(String args[]) {
        System.out.println(multiply("123", "456"));
        System.out.println(multiply("2", "3"));
        System.out.println(multiply("1237896541", "4568956327"));
    }
}
