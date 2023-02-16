package list;

/* 
接口：java.util.List<>。

实现：

    java.util.ArrayList<>：变长数组
    java.util.LinkedList<>：双链表
 */

// LinkedList 双链表
// ArrayList 变长数组
import java.util.LinkedList;
import java.util.List;

// 链表的使用
public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        // 添加元素到链表
        list.add(1);
        list.add(2);
        list.add(10);

        // 清空链表
        // list.clear();

        // 返回链表长度j
        int listSize = list.size();
        System.out.println(listSize);

        // 链表判空
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        // 访问第 i 个元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // set(i, val) 给第 i 个元素赋值为 val
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }

        System.out.println(list);
    }
}
