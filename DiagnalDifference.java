class DiagnalDifference {
    public static void solve(int[][] arr) {
        int n = arr.length;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < n; i++) {
            n1 += arr[i][i];
            n2 += arr[i][n - 1 - i];
        }
        System.out.println(Math.abs(n1 - n2));
    }

    public static void main(String args[]) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr1 = { { 1, 2 }, { 4, 6 } };
        solve(arr1);
        solve(arr);
    }
}