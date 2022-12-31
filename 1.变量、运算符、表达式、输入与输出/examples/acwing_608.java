package examples;
import java.util.Scanner;

/* 读取四个整数 A,B,C,D，并计算 (A×B−C×D) 的值。 */
public class acwing_608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.printf("DIFERENCA = %d", a * b - c * d);
    }
}