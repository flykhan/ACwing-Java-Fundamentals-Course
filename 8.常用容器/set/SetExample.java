package set;

/* 
接口：java.util.Set<K>

实现：
- java.util.HashSet<K>：哈希表(无序)：用来判断一个树是否存在,插入删除修改都是 O(1) 时间复杂度
- java.util.TreeSet<K>：平衡树：用于动态维护有序序列,可以二分找大于等于某个数的最小数,或可以找小于等于某个数的最大数
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set 集合示例
public class SetExample {

    // 哈希表示例
    public void HashSetExample() {
        System.out.println("------------------------");
        System.out.println("HashSetExample:");
        Set<Integer> s = new HashSet<>();

        s.add(2);
        s.add(1);
        s.add(10);
        System.out.println(s);

        // 遍历一个 set ,不一定是有序的,因为这里是哈希表
        for (int x : s)
            System.out.println(x);

        // 是否包含某个元素
        System.out.println(s.contains(2));

        // 删除元素
        s.remove(2);
        System.out.println(s);

        // 返回元素数
        System.out.println(s.size());

        // 判空
        System.out.println(s.isEmpty());

        // 清空
        s.clear();
        System.out.println(s);

        System.out.println("------------------------");
    }

    // 平衡树示例
    public void TreeSetExample() {
        System.out.println("------------------------");
        System.out.println("TreeSetExample:");
        // 使用 ceiling 和 floor 一定要使用 TreeSet ,而不能直接使用 Set 接口
        TreeSet<Integer> s = new TreeSet<>();

        s.add(1);
        s.add(2);
        s.add(10);
        System.out.println(s);

        // ceiling(key) 返回大于等于 key 的最小元素,不存在则返回 null
        System.out.println("s.ceiling(1)->大于等于1的最小元素: " + s.ceiling(1));

        // floor(key) 返回小于等于 key 的最大元素,不存在则返回 null
        System.out.println("s.floor(5)->小于等于5的最大元素: " + s.floor(5));

        // 是否包含某个元素
        System.out.println(s.contains(2));

        // 删除元素
        s.remove(2);
        System.out.println(s);

        // 返回元素数
        System.out.println(s.size());

        // 判空
        System.out.println(s.isEmpty());

        // 清空
        s.clear();
        System.out.println(s);

        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        SetExample[] setExamples = { new SetExample(), new SetExample() };

        setExamples[0].HashSetExample();
        setExamples[1].TreeSetExample();
    }
}
