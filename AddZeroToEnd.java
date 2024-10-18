import java.util.ArrayList;
import java.util.Arrays;

public class AddZeroToEnd {
    public static void addZero(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                num.add(arr[i]);
            else
                zero.add(arr[i]);
        }
        for (int i = 0; i < num.size(); i++)
            arr[i] = num.get(i);
        for (int i = num.size(); i < arr.length; i++)
            arr[i] = 0;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int[] arr = { 6, 0, 9, 0, 8, 0, 7, 0, 1, 1, 0, 0, 2 };
        addZero(arr);
    }
}