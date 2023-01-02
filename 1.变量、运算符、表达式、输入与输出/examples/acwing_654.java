import java.util.Scanner;

public class acwing_654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours = n / 3600;
        n %= 3600;
        int minutes = n / 60;
        int seconds = n % 60;
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }
}
