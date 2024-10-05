import java.util.*;

public class Large {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 2, 6, 7, 8 };
        Arrays.sort(arr);
        System.out.println("Largest Number is: " + arr[arr.length - 1]);
    }
}
