import java.util.*;

public class HeughtChecker {
    public static void check(int[] height) {
        int n = height.length;
        int[] expected = new int[n];
        for (int i = 0; i < n; i++)
            expected[i] = height[i];
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] != expected[i])
                count++;
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 1, 4, 2, 1, 3 };
        int[] arr2 = { 5, 1, 2, 3, 4 };
        int[] arr3 = { 1, 2, 3, 4, 5 };

        check(arr1);
        check(arr2);
        check(arr3);
    }
}
