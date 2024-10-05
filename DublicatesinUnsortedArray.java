import java.util.*;

public class DublicatesinUnsortedArray {
    public static void solve(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (res.contains(arr[i])) {
                if (!dup.contains(arr[i]))
                    dup.add(arr[i]);
            } else
                res.add(arr[i]);
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 1, 9, 3, 1, 3, 9 };
        solve(arr);
    }
}
