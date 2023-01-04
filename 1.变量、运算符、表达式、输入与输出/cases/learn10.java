import java.io.BufferedReader;
import java.io.InputStreamReader;

public class learn10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);
        System.out.println(x + y);
    }
}
