import java.util.Scanner;

public class Ac808_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        for (int i = Math.max(a, b); i > 0; i--)
            if (a % i == 0 && b % i == 0)
                return i;
        return -1;
    }
}
