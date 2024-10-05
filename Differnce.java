public class Differnce {
    public static void findCount(int[] arr, int num, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int abd = Math.abs(arr[i] - num);
            if (abd <= diff)
                count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 14, 56, 77, 13 };
        int num = 13;
        int diff = 2;
        findCount(arr, num, diff);
    }
}