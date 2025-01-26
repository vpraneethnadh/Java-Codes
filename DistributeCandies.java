public class DistributeCandies {
    public static void disCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int j = 0;

        while (candies > 0) {
            for (int i = 0; i < arr.length && candies > 0; i++) {
                if (j + 1 > candies) {
                    arr[i] += candies;
                    candies = 0;
                } else {
                    arr[i] += j + 1;
                    candies -= j + 1;
                    j++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        disCandies(7, 4);
        disCandies(10, 3);
    }
}
