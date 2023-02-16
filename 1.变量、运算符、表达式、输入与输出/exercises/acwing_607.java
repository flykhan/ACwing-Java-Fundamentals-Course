import java.util.Scanner;

public class acwing_607 {

    public void averageNumber() {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();
        double res = A * 0.2 + B * 0.3 + C * 0.5;
        System.out.printf("MEDIA = %.1f", res);
        sc.close();
    }

    public static void main(String[] args) {
        acwing_607 test = new acwing_607();
        test.averageNumber();
    }
}
