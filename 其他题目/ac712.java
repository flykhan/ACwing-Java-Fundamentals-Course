import java.util.Scanner;

public class ac712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 6; i++) {
            Double temp = sc.nextDouble();
            if (temp > 0)
                count++;
        }
        System.out.printf("%d positive numbers", count);
    }
}
