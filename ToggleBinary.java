// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment 
// problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as 
// an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most 
// significant bit. Print the positive integer value after toggling all bits”.
// Constrains-
// 1<=N<=100

// Example 1:
// Input :
// 10  -> Integer
// Output :
// 5 -> result- Integer

// Explanation:
// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

public class ToggleBinary {
    public static void toggle(int n) {
        String str = Integer.toBinaryString(n);
        // System.out.println(str);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0')
                res += '1';
            else
                res += '0';
        }
        // System.out.println(res);
        System.out.println(Integer.parseInt(res, 2));
    }

    public static void main(String args[]) {
        toggle(10);
        toggle(20);
    }
}
