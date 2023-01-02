import java.util.Scanner;

public class acwing_605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, PROD;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        PROD = n1 * n2;
        System.out.printf("PROD = %d", PROD);
        sc.close();
    }
}
