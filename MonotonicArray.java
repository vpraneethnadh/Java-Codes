public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        boolean inc = true;
        boolean desc = true;

        for (int i = 1; i < n; i++) {
            if (!inc && !desc)
                return false;
            if (nums[i] < nums[i - 1])
                inc = false;
            if (nums[i] > nums[i - 1])
                desc = false;
        }
        return inc || desc;
    }

    public static void main(String[] args) {
        int[] testCase1 = { 1, 2, 2, 3 };
        int[] testCase2 = { 6, 5, 4, 4 };
        int[] testCase3 = { 1, 3, 2 };
        int[] testCase4 = { 1, 1, 1 };

        System.out.println(isMonotonic(testCase1));
        System.out.println(isMonotonic(testCase2));
        System.out.println(isMonotonic(testCase3));
        System.out.println(isMonotonic(testCase4));
    }
}
