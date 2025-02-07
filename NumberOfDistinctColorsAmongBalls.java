import java.util.*;

public class NumberOfDistinctColorsAmongBalls {
    public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ball = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = queries.length;
        int[] res = new int[count];

        for (int i = 0; i < count; i++) {
            if (!ball.containsKey(queries[i][0])) {
                ball.put(queries[i][0], queries[i][1]);
            } else {
                if (map.get(ball.get(queries[i][0])) == 1)
                    map.remove(ball.get(queries[i][0]));
                else
                    map.put(ball.get(queries[i][0]), map.get(ball.get(queries[i][0])) - 1);
                ball.put(queries[i][0], queries[i][1]);
            }
            map.put(queries[i][1], map.getOrDefault(queries[i][1], 0) + 1);
            res[i] = map.size();
        }
        return res;
    }

    public static void main(String args[]) {
        int limit1 = 4;
        int[][] queries1 = { { 1, 4 }, { 2, 5 }, { 1, 3 }, { 3, 4 } };
        System.out.println(Arrays.toString(queryResults(limit1, queries1)));

        int limit2 = 4;
        int[][] queries2 = { { 0, 1 }, { 1, 2 }, { 2, 2 }, { 3, 4 }, { 4, 5 } };
        System.out.println(Arrays.toString(queryResults(limit2, queries2)));
    }
}