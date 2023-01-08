import java.util.Scanner;

public class Ac805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println(max(x, y));
        sc.close();
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }
}