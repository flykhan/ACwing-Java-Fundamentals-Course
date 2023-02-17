import java.util.LinkedList;
import java.util.List;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getString() {
        return String.format("(%d, %d)", x, y);
    }
}

// @Deprecated
class ColorPoint extends Point {
    // @SuppressWarnings：抑制编译器警告
    // "all"是删掉全部警告
    @SuppressWarnings({ "all" })
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // @Override:限定某个函数必须重载其他函数,该注解只能用于函数
    @Override
    // @Deprecated:用于表示某个程序元素(类、函数)已过时,不能再被调用,该注解可以标注在类和函数上
    @Deprecated
    public String getString() {
        return String.format("(%d, %d, %s)", super.x, super.y, color);
    }
}

public class Main {

    // 警告抑制示例
    @SuppressWarnings({ "all" })
    public static void main(String[] args) {
        /*
         * // 调用过时方法示例
         * ColorPoint cPoint = new ColorPoint(3, 4, "red");
         * String res = cPoint.getString();
         * System.out.println(res);
         */

        // 警告抑制示例
        List list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
    }
}
