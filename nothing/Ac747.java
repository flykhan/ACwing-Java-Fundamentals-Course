import java.util.Scanner;

public class Ac747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = sc.next();// 输入操作值
        double res = 0;
        int cnt = 0;// 计数器
        double[][] w = new double[12][12];
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++) {
                w[i][j] = sc.nextDouble();
                if (i + j < 11) {
                    res += w[i][j];
                    cnt++;
                }
            }

        if ("M".equals(op))
            res /= cnt;

        System.out.printf("%.1f", res);
    }
}
