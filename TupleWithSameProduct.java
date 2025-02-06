import java.util.*;

public class TupleWithSameProduct {
    public static int countTuples(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                int prod = arr[i] * arr[j];
                Set<Integer> set = new HashSet<>();
                for (int k = i + 1; k < j; k++) {
                    if (prod % arr[k] == 0) {
                        int val = prod / arr[k];
                        if (set.contains(val))
                            count += 8;
                        set.add(arr[k]);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 4, 6 };
        System.out.println(countTuples(nums1));

        int[] nums2 = { 1, 2, 4, 5, 10 };
        System.out.println(countTuples(nums2));
    }
}