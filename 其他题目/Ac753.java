import java.util.Scanner;

public class Ac753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int a = Math.min(i, n + 1 - i);// i左右两边距离最小值
                    int b = Math.min(j, n + 1 - j);// j上下两边距离最小值
                    System.out.printf("%d ", Math.min(a, b));// 点(i,j)四周距离最小值
                }
                System.out.println();// 每行的换行
            }
            System.out.println();// 每个矩阵的换行
        }
    }
}
