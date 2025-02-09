import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            int x = candies[i];
            if ((x + extraCandies) >= max)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] candies1 = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithCandies(candies1, 3));

        int[] candies2 = { 4, 2, 1, 1, 2 };
        System.out.println(kidsWithCandies(candies2, 1));

        int[] candies3 = { 12, 1, 12 };
        System.out.println(kidsWithCandies(candies3, 10));
    }
}