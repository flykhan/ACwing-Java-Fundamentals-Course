package exercises;

import java.util.Scanner;

import Main;

class Main {
    // 数组替换
    public void arraySubstitution() {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) {
            int temp = sc.nextInt();
            if (temp <= 0)
                X[i] = 1;
            else
                X[i] = temp;
        }
        for (int i = 0; i < X.length; i++) {
            System.out.printf("X[%d] = %d\n", i, X[i]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.arraySubstitution();
    }
}
