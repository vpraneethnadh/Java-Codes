import java.util.*;

public class SecondLargeSecondSmall {
    public static void LargeSmallSum(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int sum = even.get(1) + odd.get(1);
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int[] arr = { 3, 2, 1, 7, 5, 4 };
        LargeSmallSum(arr);
    }
}
