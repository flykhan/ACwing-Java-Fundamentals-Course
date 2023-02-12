import java.util.Scanner;

public class Ac737 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++)
            x[i] = sc.nextInt();
        for (int i = 0; i < x.length; i++) {
            if (x[i] <= 0)
                x[i] = 1;
            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
    }
}