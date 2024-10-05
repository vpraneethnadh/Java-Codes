import java.util.*;

public class ProductPairSum {
    public static int ProductSmallestpair(int sum, int[] arr) {
        if (arr.length < 2)
            return -1;
        else {
            Arrays.sort(arr);
            int sum2 = arr[0] + arr[1];
            int pro = 0;
            if (sum2 < sum) {
                pro = arr[0] * arr[1];
                return pro;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = 4;
        int[] arr = { 9, 8, 3, -7, 3, 9 };
        System.out.println(ProductSmallestpair(sum, arr));
    }
}
