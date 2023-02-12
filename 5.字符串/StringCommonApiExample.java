// String 类常用 API 用法举例

/* 使用下述命令来指定编译时的编码类型为UTF-8
javac -encoding utf-8 Main.java
 */

public class StringCommonApiExample {
    public void apisTest() {
        String str = "Hello World flkh";

        // 求字符串长度
        int lenth = str.length();
        System.out.println(lenth);

        // 分割字符串
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        // 查找,找不到返回-1
        // 查找指定字符首次出现的位置
        System.out.println(str.indexOf('W'));
        // 查找指定字符串首次出现的位置
        System.out.println(str.indexOf("fl"));
        // 查找指定字符串最后出现的位置
        System.out.println(str.lastIndexOf('l'));
        // 查找指定字符串最后出现的位置(标识位置在字符串首字母的位置)
        System.out.println(str.lastIndexOf("fl"));

        // 判断两个字符串是否相等,注意不能直接用用 ==
        System.out.println("Hello".equals(strs[0]));

        // 判断两个字符串的字典序大小,负数表示小于,0表示等于,正数表示大于
        System.out.println("Arch".compareTo("Brch"));

        // 判断是否以某个前缀开头
        System.out.println("Arch".startsWith("Ae"));

        // 判断是否以某个后缀结尾
        System.out.println("Arch".endsWith("ch"));

        // 去掉首尾的空白字符
        System.out.println("  jjxxjj k ".trim());

        // 全部用小写字符
        System.out.println(str.toLowerCase());

        // 全部用大写字符
        System.out.println(str.toUpperCase());

        // 替换字符
        System.out.println(str.replace("l", "x"));

        // 替换字符串
        System.out.println(str.replace("flkh", "flykhan"));

        // 返回 [beginIndex, endIndex] 中的子串
        System.out.println(str.substring(2, 10));

        // 将字符串转化成字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public static void main(String[] args) {
        new StringCommonApiExample().apisTest();
    }
}
