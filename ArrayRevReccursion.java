class ArrayRevRecursion {
    public static void rev(int[] arr, int[] res, int i) {
        if (i == arr.length) 
            return;
        res[arr.length - 1 - i] = arr[i];
        rev(arr, res, i + 1);
    }

    public static int[] rev(int[] arr) {
        int[] res = new int[arr.length];
        rev(arr, res, 0);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArr = rev(arr);
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}
