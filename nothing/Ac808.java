import java.util.Scanner;

public class Ac808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));

    }

    public static int gcd(int a, int b) {
        int c = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                c = i;
        }
        return c;
    }
}
