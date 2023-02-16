import java.util.Scanner;

class Main {

    // 计算工资和薪水
    public void salary() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double basicSalary = sc.nextDouble(); // 底薪
        double monthlySales = sc.nextDouble(); // 月销售额
        double res = basicSalary + monthlySales * 15 / 100;
        System.out.printf("TOTAL = R$ %.2f", res);
        sc.close();
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.salary();
    }
}
