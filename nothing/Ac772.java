import java.util.Scanner;

public class Ac772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - 'a';
            cnt[temp]++;
        }

        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - 'a';
            if (cnt[temp] == 1) {
                System.out.println(str.charAt(i));
                return;// 找到第一个匹配值后，结束程序
            }
        }

        System.out.println("no");// 找不到匹配值时，输出no
    }
}
