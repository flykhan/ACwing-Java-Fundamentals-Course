import java.util.Scanner;

public class acwing_612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double Pi = 3.14159;
        int R = sc.nextInt();
        System.out.printf("VOLUME = %.3f", (4 / 3.0) * Pi * Math.pow(R, 3));
    }
}
