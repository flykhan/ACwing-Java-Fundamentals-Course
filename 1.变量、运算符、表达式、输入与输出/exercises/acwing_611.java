import java.util.Scanner;

public class acwing_611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2;
        int num1, num2;
        float price1, price2;
        no1 = sc.nextInt();
        num1 = sc.nextInt();
        price1 = sc.nextFloat();
        no2 = sc.nextInt();
        num2 = sc.nextInt();
        price2 = sc.nextFloat();
        System.out.printf("VALOR A PAGAR: R$ %.2f", num1 * price1 + num2 * price2);
        sc.close();
    }
}
