import java.lang.Math;
import java.util.Scanner;

public class acwing_616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double dx = x1 - x2, dy = y1 - y2;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.printf("%.4f", distance);
    }
}
