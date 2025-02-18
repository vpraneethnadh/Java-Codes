public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum ^= nums[i];
        return sum;
    }

    public static void main(String args[]) {
        int[] nums1 = { 2, 2, 1 };
        int[] nums2 = { 4, 1, 2, 1, 2 };
        int[] nums3 = { 1 };

        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
}
