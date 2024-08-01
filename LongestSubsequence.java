import java.util.*;

public class LongestSubsequence {
    public static void longestSub(int[] nums) {
        if (nums == null || nums.length == 0)
            System.out.println(0);
        
        int[] dp = new int[nums.length];
        int maxLength = 1;
        Arrays.fill(dp,1);
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        System.out.println(maxLength);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0;i < test;i ++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            longestSub(arr);            
        }
        sc.close();
    }
}
