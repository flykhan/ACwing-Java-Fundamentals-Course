import java.util.Scanner;
import java.io.*;

public class Ac823 {
    private static int[] path;
    private static boolean[] st;
    private static int n;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        st = new boolean[n];// 遍历标志
        dfs(0);
        bw.flush();
    }

    private static void dfs(int u) throws Exception {
        if (u == n) {
            for (int i = 0; i < n; i++)
                bw.write(path[i] + " ");
            bw.write("\n");
        } else {
            for (int i = 0; i < n; i++)
                if (!st[i]) {
                    st[i] = true;
                    path[u] = i + 1;
                    dfs(u + 1);
                    st[i] = false;
                }
        }
    }
}
