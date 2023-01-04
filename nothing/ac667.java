import java.util.Scanner;

public class ac667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a < b)
            System.out.printf("O JOGO DUROU %d HORA(S)", b - a);
        else
            System.out.printf("O JOGO DUROU %d HORA(S)", 24 - a + b);
    }
}
