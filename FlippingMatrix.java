public class FlippingMatrix {
    public static void solve(int[][] mat, int n) {
        n /= 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int topLeft = mat[i][j];
                int topRight = mat[i][2 * n - j - 1];
                int bottomLeft = mat[2 * n - i - 1][j];
                int bottomRight = mat[2 * n - i - 1][2 * n - j - 1];
                maxSum += Math.max(Math.max(topLeft, topRight), Math.max(bottomLeft, bottomRight));
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int n = 4; // For Example
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        solve(mat, n);
    }
}