import java.util.Scanner;

public class Ac743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[12][12];
        int l = sc.nextInt();
        String str = sc.next();
        double res = 0.0, temp = 0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        if ("S".equals(str)) {
            for (int i = 0; i < m[0].length; i++) {
                res += m[l][i];
            }
        } else if ("M".equals(str)) {
            for (int i = 0; i < m[0].length; i++) {
                temp += m[l][i];
            }
            res = temp / m[0].length;
        }

        System.out.printf("%.1f\n", res);
    }
}
