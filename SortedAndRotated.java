public class SortedAndRotated {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int[] checkSorted = new int[n];
        for (int i = 0; i < n; ++i) {
            int j = 0;
            for (int k = i; k < n; ++k)
                checkSorted[j++] = nums[k];
            for (int k = 0; k < i; ++k)
                checkSorted[j++] = nums[k];
            boolean isSorted = true;
            for (int l = 0; l < n - 1; ++l) {
                if (checkSorted[l] > checkSorted[l + 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 5, 1, 2 };
        int[] nums2 = { 2, 1, 3, 4 };
        int[] nums3 = { 1, 2, 3 };

        System.out.println(check(nums1));
        System.out.println(check(nums2));
        System.out.println(check(nums3));
    }
}
