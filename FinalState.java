public class FinalState {
    public static void getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            int min = 0;
            for (int j = 1; j < n; j++) {
                if (nums[j] < nums[min])
                    min = j;
            }
            nums[min] *= multiplier;
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr1 = { 2, 1, 3, 5, 6 };
        int k1 = 5;
        int multiplier1 = 2;
        int[] arr2 = { 1, 2 };
        int k2 = 3;
        int multiplier2 = 4;
        getFinalState(arr1, k1, multiplier1);
        getFinalState(arr2, k2, multiplier2);
    }
}
