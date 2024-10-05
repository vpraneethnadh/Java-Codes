import java.util.*;

public class DuplicatesinSortedArray {
    public static void solve(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                duplicates.add(arr[i]);
            else
                nums.add(arr[i]);
        }
        Collections.sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
        for (int i = 0; i < duplicates.size(); i++)
            System.out.print("_ ");
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7 };
        solve(arr);
    }
}