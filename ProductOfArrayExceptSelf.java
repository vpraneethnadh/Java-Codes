public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++)
            res[i] = 1;
        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] * nums[i - 1];
        int x = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= x;
            x *= nums[i];
        }
        return res;
    }

    public static void main(String args[]) {
        int[] num1 = { 1, 2, 3, 4 };
        int[] res1 = productExceptSelf(num1);
        for (int i = 0; i < num1.length; i++) {
            System.out.print(res1[i] + " ");
            ;
        }
        System.out.println();

        int[] num2 = { -1, 1, 0, -3, 3 };
        int[] res2 = productExceptSelf(num2);
        for (int i = 0; i < num2.length; i++) {
            System.out.print(res2[i] + " ");
            ;
        }
        System.out.println();
    }
}