import java.util.Scanner;

public class Ac770_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        String a = sc.next(), b = sc.next();
        for (String str : strs) {
            if (a.equals(str))
                System.out.printf("%s ", b);
            else
                System.out.printf("%s ", str);
        }
    }
}
