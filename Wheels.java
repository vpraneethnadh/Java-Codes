public class Wheels {
    public static void solve(int v, int w) {
        float res = ((4 * v) - w) / 2;
        if (w >= 2 && (w % 2 == 0) && v < w)
            System.out.println("TW= " + (int) (res) + "FW= " + (int) (v - res));
        else
            System.out.println("INVALID INPUT");
    }

    public static void main(String args[]) {
        int v = 200;
        int w = 540;
        solve(v, w);
    }
}
