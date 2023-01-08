import java.util.Scanner;

public class Ac756 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] res = new int[n][m];
        int[] dx = { -1, 0, 1, 0 }, dy = { 0, 1, 0, -1 };
        int x = 0, y = 0, d = 1;
        for (int i = 1; i <= n * m; i++) {
            res[x][y] = i;
            int a = x + dx[d], b = y + dy[d];
            if (a < 0 || a >= n || b < 0 || b >= m || res[a][b] > 0) {// 撞墙，换方向
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.printf("%d ", res[i][j]);
            System.out.println();
        }

    }
}
