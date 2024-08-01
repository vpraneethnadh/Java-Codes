import java.util.*;

class Main {
    public static void bettinggame(String str) {
        int total = 10;
        int bet = 1;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'W') {
                total += bet;
                bet = Math.max(bet / 2, 1);
            } else if (ch == 'L') {
                total -= bet;
                if (total < 0) {
                    System.out.println(-1);
                    return;
                }
                bet = bet * 2;
            }
        }
        System.out.println(total);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        bettinggame(str);
        sc.close();
    }
}
