import java.util.Stack;

public class BasketBallGame {
    public static void calculate(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            String op = arr[i];
            if (op.equals("C"))
                stack.pop();
            else if (op.equals("D"))
                stack.push(stack.peek() * 2);
            else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else
                stack.push(Integer.parseInt(op));
        }
        int sum = 0;
        for (int i = 0; i < stack.size(); i++)
            sum += stack.get(i);
        System.out.println(sum);
    }

    public static void main(String args[]) {
        String[] arr1 = { "5", "2", "C", "D", "+" };
        String[] arr2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        calculate(arr1);
        calculate(arr2);
    }
}
