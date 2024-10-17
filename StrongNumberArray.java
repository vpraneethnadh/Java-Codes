public class StrongNumberArray {
    public static int fact(int n) {
        int x = 1;
        if (n == 0 || n == 1)
            return n;
        else {
            for (int i = 1; i <= n; i++)
                x *= i;
        }
        return x;
    }

    public static boolean strongNumber(int n) {
        if (n == 0)
            return false;
        if (n == 1 || n == 2)
            return true;
        int x = n;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += fact(r);
            n /= 10;
        }
        if (sum == x)
            return true;
        return false;
    }

    public static void strong(int[] arr) {
        if (arr.length == 0)
            System.out.println("There are no elements in array!");
        else {
            System.out.print("Strong numbers in the given array are: ");
            for (int i = 0; i < arr.length; i++) {
                if (strongNumber(arr[i]) == true)
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 145, 153, 7 };
        strong(arr);
    }
}
