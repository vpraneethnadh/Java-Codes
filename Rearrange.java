import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 1, 6, 5, 9 };
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mid = n / 2;
        int left = mid;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}