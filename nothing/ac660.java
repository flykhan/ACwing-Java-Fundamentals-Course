import java.util.Scanner;

public class ac660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        double price;
        if (x == 1)
            price = 4.00;
        else if (x == 2)
            price = 4.50;
        else if (x == 3)
            price = 5.00;
        else if (x == 4)
            price = 2.00;
        else
            price = 1.50;
        System.out.printf("Total: R$ %.2f", y * price);
    }
}
