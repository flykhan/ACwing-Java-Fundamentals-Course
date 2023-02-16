import java.util.Scanner;

class Main {
    // 阶乘
    public int fact(int n) {
        int res = 1;
        for (int i = n; i > 1; i--)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        Main test = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resOut = test.fact(n);
        System.out.println(resOut);
        sc.close();
    }
}
