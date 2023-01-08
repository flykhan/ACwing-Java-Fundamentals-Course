import java.util.Scanner;

public class Ac779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;

            String[] strs = new String[n];
            for (int i = 0; i < n; i++)
                strs[i] = sc.next();

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= strs[0].length(); i++) {
                boolean flag = true;
                char c = strs[0].charAt(strs[0].length() - i);

            }
        }
    }
}
