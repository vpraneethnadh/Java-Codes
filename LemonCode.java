public class LemonCode {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            int x = bills[i];
            if (x == 5)
                five++;
            else if (x == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else
                    return false;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3)
                    five -= 3;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills));

        int[] bills2 = { 5, 5, 10, 10, 20 };
        System.out.println(lemonadeChange(bills2));
    }
}
