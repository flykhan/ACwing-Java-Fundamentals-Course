package 题目;

import java.util.Scanner;

import Main;

class Main {
    // 字符串长度
    public void stringLength() {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        int res = stringInput.length();
        System.out.println(res);
        sc.close();
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.stringLength();
    }
}
