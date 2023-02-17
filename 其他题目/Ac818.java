import java.util.Scanner;

public class Ac818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sort(a, l, r);
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", a[i]);
    }

    private static void sort(int a[], int l, int r) {
        for (int i = r; i > l; i--) {
            for (int j = l; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }
}
