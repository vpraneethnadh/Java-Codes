import java.util.Arrays;

public class SecondSmallandLarge {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 2, 6, 7, 8 };
        Arrays.sort(arr);
        System.out.println("Second smallest Number is: " + arr[1]);
        System.out.println("Second largest Number is: " + arr[arr.length - 2]);
    }
}
