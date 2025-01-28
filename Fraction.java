import java.util.HashMap;

public class Fraction {
    public static boolean isRepeated(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (int count : freq.values()) {
            if (count > 1)
                return true;
        }
        return false;
    }

    public static String toConvert(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                result.insert(map.get(ch), "(");
                result.append(")");
                break;
            }
            map.put(ch, result.length());
            result.append(ch);
        }
        return result.toString();
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        StringBuilder result = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0))
            result.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0)
            return result.toString();

        result.append(".");
        StringBuilder fractionalPart = new StringBuilder();
        HashMap<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                fractionalPart.insert(map.get(remainder), "(");
                fractionalPart.append(")");
                break;
            }
            map.put(remainder, fractionalPart.length());
            remainder *= 10;
            fractionalPart.append(remainder / den);
            remainder %= den;
        }

        String fracString = fractionalPart.toString();
        if (isRepeated(fracString)) {
            fracString = toConvert(fracString);
        }
        result.append(fracString);
        return result.toString();
    }

    public static void main(String args[]) {
        System.out.println(fractionToDecimal(1, 2));
        System.out.println(fractionToDecimal(2, 1));
        System.out.println(fractionToDecimal(4, 333));
    }
}
