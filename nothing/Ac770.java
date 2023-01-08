import java.util.Scanner;

public class Ac770 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        String oldWord = sc.next(), newWord = sc.next();
        for (int i = 0; i < strs.length; i++) {
            if (oldWord.equals(strs[i]))
                strs[i] = newWord;
            System.out.printf("%s ", strs[i]);
        }

    }
}
