import java.util.Scanner;

public class acwing_609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int duration = sc.nextInt();
        double hourlyWage = sc.nextDouble();
        double income = duration * hourlyWage;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, income);
    }
}
