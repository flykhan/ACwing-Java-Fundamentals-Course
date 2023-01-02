import java.util.Scanner;

public class acwing_615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextFloat();
        double M = X / Y;
        System.out.printf("%.3f km/l", M);
    }
}
