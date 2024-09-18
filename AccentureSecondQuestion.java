public class AccentureSecondQuestion {
    public static void solve(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("Invalid input");
            return;
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int x = arr[i] + arr[j];
                    if (x == 60) {
                        System.out.println("(" + arr[i] + "," + arr[j] + ")");
                        count++;
                    }
                }
            }
            System.out.println("Count: " + count);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 58, 59, 60, 5 };
        solve(arr);
    }
}
