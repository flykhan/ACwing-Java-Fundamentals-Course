/* 
    StringBuilder 线程安全(多线程常用),速度较慢;
    StringBuffer 线程不安全,速度较快;
 */
public class StringBuilderAndStringBufferExample {

    public void builderTest() {
        // 初始化一个 StringBuilder 对象
        StringBuilder sbud = new StringBuilder("Hello ");

        sbud.append("World");
        System.out.println(sbud);

        for (int i = 0; i < sbud.length(); i++) {
            // 读取 i 位置的字符后面一位的ASCII字符,并将其转换为新字符后写入 i 位置
            sbud.setCharAt(i, (char) (sbud.charAt(i) + 1));
        }
        System.out.println(sbud);

        // 翻转字符串
        sbud.reverse();
        System.out.println(sbud);
    }

    public void bufferTest() {
        // 初始化一个 StringBuffer 对象
        StringBuffer sbuf = new StringBuffer("你好 ");

        sbuf.append("世界");
        System.out.println(sbuf);

        for (int i = 0; i < sbuf.length(); i++) {
            sbuf.setCharAt(i, (char) (sbuf.charAt(i) + 1));
        }
        System.out.println(sbuf);
    }

    public static void main(String[] args) {
        System.out.println("StringBuilder Test:");
        new StringBuilderAndStringBufferExample().builderTest();
        System.out.println("\n" + "StringBuffer Test:");
        new StringBuilderAndStringBufferExample().bufferTest();
    }
}
