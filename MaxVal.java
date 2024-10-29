public class MaxVal {
    public static void main(String args[]) {
        int[] arr = { 7, 4, 8, 2, 9 };
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);
    }
}