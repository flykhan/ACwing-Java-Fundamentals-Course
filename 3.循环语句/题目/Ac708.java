import Main;

package 题目;

class Main {
    // 偶数输出
    public void evenNumberOutPut() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.evenNumberOutPut();
    }
}
