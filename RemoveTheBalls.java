import java.util.*;
public class RemoveTheBalls{
    public static int countWaysToEmptyBox(int n) {
        int[] dp = new int[n + 1];
        if (n < 0)
            return 0;
        else if(n == 0 || n == 1 || n == 2)
            return 1;
        else if(n == 3)
            return 2;
        else{
            dp[0] = 1; 
            for (int i = 1; i <= n; i++) {
                dp[i] = dp[i - 1];
                if (i >= 3)
                    dp[i] += dp[i - 3];
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of ways to empty the box: " + countWaysToEmptyBox(n));
        sc.close();
    }
}
    