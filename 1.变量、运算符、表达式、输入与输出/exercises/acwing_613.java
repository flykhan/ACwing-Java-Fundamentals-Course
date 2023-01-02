import java.util.Scanner;

public class acwing_613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double Pi = 3.14159;
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
        System.out.printf("CIRCULO: %.3f\n", Pi * Math.pow(C, 2));
        System.out.printf("TRAPEZIO: %.3f\n", (A + B) * C / 2);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);

    }
}
