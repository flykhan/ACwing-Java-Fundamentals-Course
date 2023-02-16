import java.util.Scanner;

class Solution {
    // 斐波那契数列:第一项是 0 ,第二项是 1 ,后面每一项是前两项的和
    public int Fibonacci(int n) {
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    // 递归方法
    public int Fibonacci2(int n) {
        if (n <= 1)
            return n;
        return (Fibonacci2(n - 1) + Fibonacci2(n - 2));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInput = sc.nextInt();

        int res = new Solution().Fibonacci2(nInput);
        System.out.println(res);
        sc.close();
    }
}
