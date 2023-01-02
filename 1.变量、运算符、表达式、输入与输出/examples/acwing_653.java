import java.util.Scanner;

public class acwing_653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int $_100, $_50, $_20, $_10, $_5, $_2, $_1;
        $_100 = N / 100;
        N %= 100;
        $_50 = N / 50;
        N %= 50;
        $_20 = N / 20;
        N %= 20;
        $_10 = N / 10;
        N %= 10;
        $_5 = N / 5;
        N %= 5;
        $_2 = N / 2;
        N %= 2;
        $_1 = N;
        System.out.printf(
                "%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00",
                temp, $_100, $_50, $_20, $_10, $_5, $_2, $_1);
    }
}
