public class SplitandChange {
    public static String change(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (Character.isUpperCase(x))
                res += Character.toLowerCase(x);
            else
                res += Character.toUpperCase(x);
        }
        return res;
    }

    public static void splitandchange(String str) {
        String[] arr = str.split("(?=[A-Z])");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(change(arr[i]));
        }
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        splitandchange(str);
    }
}
