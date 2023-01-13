import java.util.Scanner;
import java.util.Stack;

public class Ac828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        // 用法等同于for(int i = 0; i < n; i++){}
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                stk.push(x);
            } else if (op.equals("pop")) {
                stk.pop();
            } else if (op.equals("empty")) {
                if (stk.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println(stk.peek());
            }
        }
    }
}
