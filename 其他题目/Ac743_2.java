import java.util.Scanner;

public class Ac743_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String op = sc.next();

        double[][] w = new double[12][12];
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                w[i][j] = sc.nextDouble();

        double sum = 0;
        for (int i = 0; i < 12; i++)
            sum += w[l][i];

        if ("M".equals(op))
            sum /= 12;

        System.out.printf("%.1f", sum);
    }
}
