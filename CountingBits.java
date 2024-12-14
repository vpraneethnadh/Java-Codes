public class CountingBits {
    public int count1(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1')
                x++;
        }
        return x;
    }

    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            arr[i] = count1(bin);
        }
        return arr;
    }

    public static void main(String args[]) {
        CountingBits cb = new CountingBits();
        int[] arr = cb.countBits(1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
