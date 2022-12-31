import java.util.Scanner;

public class acwing_606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat(), b = sc.nextFloat();
        double x = a * 3.5 / 11 + b * 7.5 / 11;
        System.out.printf("MEDIA = %.5f", x);
    }
}
