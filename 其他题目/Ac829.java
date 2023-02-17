import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ac829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                queue.add(x);
            } else if (op.equals("pop")) {
                queue.remove();
            } else if (op.equals("empty")) {
                if (queue.isEmpty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println(queue.peek());
            }
        }
    }
}
