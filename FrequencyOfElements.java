import java.util.*;

public class FrequencyOfElements {
    public static void freq(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());

        int maxFreq = 0;
        int maxFreqNum = -1;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFreq || (entry.getValue() == maxFreq && entry.getKey() > maxFreqNum)) {
                maxFreq = entry.getValue();
                maxFreqNum = entry.getKey();
            }
        }
        System.out.println("\nElement with the highest frequency:");
        System.out.println("Number: " + maxFreqNum + ", Frequency: " + maxFreq);
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 5, 1, 6, 2 };
        freq(nums);
    }
}
