public class CanPlaceFlower {
    public static void calculate(int[] flowerbed, int n) {
        int count = 0;
        int consecutiveZeros = 1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0)
                consecutiveZeros++;
            else {
                count += (consecutiveZeros - 1) / 2;
                consecutiveZeros = 0;
            }
        }
        count += consecutiveZeros / 2;

        if (count >= n == true)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 0, 0, 0, 1 };
        int n1 = 1;
        calculate(arr1, n1);

        int[] arr2 = { 1, 0, 0, 0, 1 };
        int n2 = 2;
        calculate(arr2, n2);
    }
}
