public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[nonZeroIndex++] = nums[i];
        }
        for (int i = nonZeroIndex; i < nums.length; i++)
            nums[i] = 0;

        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 0, 3, 12 };
        int[] nums2 = { 0 };
        moveZeroes(nums1);
        moveZeroes(nums2);
    }
}