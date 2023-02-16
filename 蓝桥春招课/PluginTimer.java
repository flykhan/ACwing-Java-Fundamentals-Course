
/**
 * 考试系统计时器
 * 
 */
import java.util.Scanner;

public class PluginTimer implements Runnable {

    public void go() {
        // 启动子线程, this 表示当前对象
        Thread t1 = new Thread(this);
        t1.start();
        Scanner sc = new Scanner(System.in);
        String info = sc.next();
        while (true) {
            if (!"o".equals(info)) {
                info = sc.next();
            } else {
                sc.close();
                System.out.println("考试结束!");
                // 退出操作
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new PluginTimer().go();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("考试开始!");
        int i = 2 * 60 * 60;
        // int i = 10;
        int i_bak = i;
        while (i != 0) {
            int h = i / 3600; // 小时
            String s_h = h < 10 ? "0" + h : "" + h;
            int min = i % 3600 / 60; // 分钟
            // 使用 String.valueOf() 可以提高数字到字符串的转换性能
            String s_min = min < 10 ? "0" + min : String.valueOf(min);
            int sec = i % 3600 % 60; // 秒
            String s_sec = (sec < 10 ? "0" : "") + sec;
            System.out.println(s_h + ":" + s_min + ":" + s_sec);

            i--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            if (i == i_bak / 2)
                System.out.println("时间已过半，请抓紧时间！");
            if (i == 5 * 60)
                System.out.println("最后 5 分钟，考试即将结束！");
        }

        System.out.println("考试结束!");
        // 结束子线程
        System.exit(0);
    }
}
