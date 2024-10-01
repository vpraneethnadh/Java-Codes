class Max69Number {
    public static void solve(int num) {
        String str = Integer.toString(num);
        if (str.indexOf('6') == -1)
            System.out.println(num);
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            String res = str;
            char ch = str.charAt(i);
            if (ch == '6')
                res = res.substring(0, i) + '9' + res.substring(i + 1);
            int n = Integer.parseInt(res);
            max = Math.max(max, n);
        }
        System.out.println(Math.max(max, num));
    }

    public static void main(String args[]) {
        solve(9669);
    }
}