import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class learn9 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 注意这里是System.out
        bw.write("Hello World\n");
        bw.flush();// 需要手动刷新缓冲区
    }
}
