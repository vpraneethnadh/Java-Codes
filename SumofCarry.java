import java.util.*;

public class SumofCarry {
    public static void sumofcarry(int num1, int num2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        while (num1 != 0) {
            int r = num1 % 10;
            arr1.add(r);
            num1 /= 10;
        }

        while (num2 != 0) {
            int r = num1 % 10;
            arr2.add(r);
            num2 /= 10;
        }

        Collections.reverse(arr2);
        Collections.reverse(arr1);
    }

    public static void main(String args[]) {
        int num1 = 451;
        int num2 = 349;
        sumofcarry(num1, num2);
    }
}
