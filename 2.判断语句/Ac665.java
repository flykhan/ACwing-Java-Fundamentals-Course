import java.util.Scanner;

class Main {
    // 倍数计算
    public void multiple() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        String res = "";
        if (A % B == 0 || B % A == 0)
            res = "Sao Multiplos";
        else
            res = "Nao sao Multiplos";
        System.out.println(res);
        sc.close();
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.multiple();
    }
}
