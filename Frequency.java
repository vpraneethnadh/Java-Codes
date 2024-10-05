public class Frequency {
    public static void freq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            boolean isPrinted = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    f++;
                    if (j < i) {
                        isPrinted = true;
                        break;
                    }
                }
            }
            if (!isPrinted) {
                System.out.println(arr[i] + " " + f);
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        freq(arr);
    }
}