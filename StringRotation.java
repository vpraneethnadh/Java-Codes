import java.util.*;

public class StringRotation {
    public static boolean isRotationEqual(String str1, String str2) {
        if (str1.length() != str2.length()) 
            return false; 

        String str3 = str2 + str2;
        return str3.contains(str1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (isRotationEqual(str1, str2))
            System.out.println("Yes"); 
        else
            System.out.println("No");
        sc.close();
    }
}
